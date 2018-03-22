package behavioralPatterns.memento.command;


import behavioralPatterns.memento.editor.Editor;

import java.lang.reflect.Field;

public class Command<T> {
    private Editor editor;
    private String field;
    private T value;

    public Command(Editor editor, String field, T value) {
        this.editor = editor;
        this.field = field;
        this.value = value;
    }

    public void execute() throws Exception {
        Field f = Editor.class.getField(this.field);
        f.set(editor, value);
    }

    public String getField() {
        return field;
    }

    public T getValue() {
        return value;
    }
}
