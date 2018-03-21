package behavioralPatterns.mediator.components;

import behavioralPatterns.mediator.mediator.Mediator;

public class AddButton implements Component {
    private Mediator mediator;

    public AddButton(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "AddButton";
    }

    public void click() {
        mediator.save();
    }
}