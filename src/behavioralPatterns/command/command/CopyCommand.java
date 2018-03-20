package behavioralPatterns.command.command;

import behavioralPatterns.command.model.Editor;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public Boolean execute() {
        editor.clipboard = editor.getSelectedText();
        return false;
    }
}
