package behavioralPatterns.mediator.components;

import behavioralPatterns.mediator.mediator.Mediator;
import behavioralPatterns.mediator.model.Note;

import java.util.ArrayList;

public class List implements Component {
    private Mediator mediator;
    ArrayList<Note> noteList = new ArrayList<Note>();

    public List(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void addElement(Note note) {
        this.noteList.add(note);
    }

    @Override
    public String getName() {
        return "List";
    }

    public ArrayList<Note> getNoteList() {
        return noteList;
    }
}