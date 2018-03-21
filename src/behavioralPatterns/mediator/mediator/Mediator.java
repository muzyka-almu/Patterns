package behavioralPatterns.mediator.mediator;

import behavioralPatterns.mediator.components.Component;
import behavioralPatterns.mediator.model.Note;

public interface Mediator {
    void addNewNote(Note note);
    String getUIInfo();
    void save();
    void registerComponent(Component component);
}