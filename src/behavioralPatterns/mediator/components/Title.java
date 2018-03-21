package behavioralPatterns.mediator.components;

import behavioralPatterns.mediator.mediator.Mediator;

public class Title implements Component {
    private Mediator mediator;
    private String text = "";

    public Title(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "Title";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
