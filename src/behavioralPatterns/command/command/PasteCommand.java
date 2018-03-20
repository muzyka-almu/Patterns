package behavioralPatterns.command.command;

import behavioralPatterns.command.model.Editor;

public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public Boolean execute() {
        if (editor.clipboard.isEmpty()) return false;

        backup();
        editor.setText(editor.getText() + editor.clipboard);
        return true;
    }
}
