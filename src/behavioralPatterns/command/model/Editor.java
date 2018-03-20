package behavioralPatterns.command.model;

import behavioralPatterns.command.command.Command;
import behavioralPatterns.command.command.CommandHistory;

public class Editor {
    private String text;
    private String selectedText = "";
    private Integer selectionStart = 0;
    private Integer selectionEnd = 0;
    private CommandHistory history = new CommandHistory();
    public String clipboard;


    public Editor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSelectedText() {
        return selectedText;
    }

    public Integer getSelectionStart() {
        return selectionStart;
    }

    public Integer getSelectionEnd() {
        return selectionEnd;
    }

    // --------------------------------------------------------------- logic

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public void undo() {
        if (history.isEmpty()) return;

        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }

    public void selectText(Integer begin, Integer end) {
        if (begin < 0) {
            begin = 0;
        }

        if (end > this.text.length()) {
            end = this.text.length();
        }

        this.selectionStart = begin;
        this.selectionEnd = end;

        this.selectedText = this.text.substring(begin, end);
    }
}
