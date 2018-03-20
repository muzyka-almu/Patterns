package behavioralPatterns.command;

import behavioralPatterns.command.command.CopyCommand;
import behavioralPatterns.command.command.CutCommand;
import behavioralPatterns.command.command.PasteCommand;
import behavioralPatterns.command.model.Editor;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor("Text! for testing command pattern on editor example!");

        System.out.println("Text start >>");
        System.out.println(editor.getText());
        System.out.println();
        editor.selectText(10, 25);

        editor.executeCommand(new CopyCommand(editor));
        System.out.println("Text after copy command >>");
        System.out.println(editor.getText());
        System.out.println();

        editor.executeCommand(new PasteCommand(editor));
        System.out.println("Text after paste command >>");
        System.out.println(editor.getText());
        System.out.println();

        editor.selectText(0, 4);
        editor.executeCommand(new CutCommand(editor));
        System.out.println("Text after cut command >>");
        System.out.println(editor.getText());
        System.out.println();

        editor.undo();
        editor.undo();
        editor.undo();
        System.out.println("Text after undo all commands >>");
        System.out.println(editor.getText());
        System.out.println();
    }
}
