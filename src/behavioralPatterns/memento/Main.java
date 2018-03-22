package behavioralPatterns.memento;

import behavioralPatterns.memento.command.Command;
import behavioralPatterns.memento.editor.Editor;

/*
Editor:Editor{title='Hello', select='somebody'}
Editor undo:Editor{title='Hello', select=''}
Editor redo:Editor{title='Hello', select='somebody'}
Editor:Editor{title='Hello', select='world'}
Editor undo:Editor{title='Hello', select='somebody'}
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Editor editor = new Editor();
        Command<String> setTitle = new Command<String>(editor, "title", "Hello");
        Command<String> setSelect = new Command<String>(editor, "select", "somebody");
        Command<String> setSelect1 = new Command<String>(editor, "select", "world");

        editor.execute(setTitle);
        editor.execute(setSelect);

        System.out.println("Editor:" + editor);
        editor.undo();
        System.out.println("Editor undo:" + editor);
        editor.redo();
        System.out.println("Editor redo:" + editor);
        editor.execute(setSelect1);
        System.out.println("Editor:" + editor);
        editor.undo();
        System.out.println("Editor undo:" + editor);
    }
}
