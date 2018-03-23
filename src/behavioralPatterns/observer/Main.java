package behavioralPatterns.observer;

import behavioralPatterns.observer.editor.Editor;
import behavioralPatterns.observer.listeners.EmailNotificationListener;
import behavioralPatterns.observer.listeners.LogOpenListener;

/*
    Main>>>>>>>>>>> before try...
    Main>>>>>>>>>>> before opening...
    Save to log /path/to/log/file.txt: Someone has performed open operation with the following file: test.txt
    Main>>>>>>>>>>> before save...
    Email to admin@example.com: Someone has performed save operation with the following file: test.txt
    After try...
 */
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        System.out.println("Main>>>>>>>>>>> before try...");

        try {
            System.out.println("Main>>>>>>>>>>> before opening...");
            editor.openFile("test.txt");
            System.out.println("Main>>>>>>>>>>> before save...");
            editor.saveFile();
        } catch (Exception e) {
            System.out.println("Main>>>>>>>>>>> before e.printStackTrace...");
            e.printStackTrace();
        }

        System.out.println("After try...");
    }
}
