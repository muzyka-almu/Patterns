package behavioralPatterns.command.command;

import behavioralPatterns.command.model.Editor;

public abstract class Command {
    public Editor editor;
    protected String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    protected void backup() {
        backup = editor.getText();
    }

    public void undo() {
        editor.setText(backup);
    }

    public abstract Boolean execute();
}
