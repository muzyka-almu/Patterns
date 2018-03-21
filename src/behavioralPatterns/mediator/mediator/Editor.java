package behavioralPatterns.mediator.mediator;

import behavioralPatterns.mediator.components.*;
import behavioralPatterns.mediator.model.Note;

public class Editor implements Mediator {
    private Title title;
    private AddButton addButton;
    private List list;

    @Override
    public void registerComponent(Component component) {
        component.setMediator(this);
        switch (component.getName()) {
            case "List":
                list = (List)component;
                break;
            case "AddButton":
                addButton = (AddButton)component;
                break;
            case "Title":
                title = (Title)component;
                break;
        }
    }

    @Override
    public void addNewNote(Note note) {
        title.setText("");
        list.addElement(note);
    }

    @Override
    public String getUIInfo() {
        return this.list
                .getNoteList()
                .stream()
                .map(Note::toString)
                .reduce("", (s, s2) -> s + "\n" + s2);
    }

    @Override
    public void save() {
        if (title.getText().equals("")) {
            System.out.println("Enter title for new note !!!!!!!!!!!!!!!!!!!!!");
            return;
        }

        Note note = new Note();
        note.setName(title.getText());
        this.addNewNote(note);
    }
}
