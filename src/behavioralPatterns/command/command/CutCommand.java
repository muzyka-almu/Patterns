package behavioralPatterns.command.command;

import behavioralPatterns.command.model.Editor;

public class CutCommand extends Command {

    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public Boolean execute() {
        if (editor.getSelectedText().isEmpty()) return false;

        backup();
        String source = editor.getText();
        editor.clipboard = editor.getSelectedText();
        editor.setText(cutString(source, editor.clipboard));
        return true;
    }

    public String cutString(String source, String cut) {
        String start = source.substring(0, editor.getSelectionStart());
        String end = source.substring(editor.getSelectionEnd(), source.length());
        return start + end;
    }
}

