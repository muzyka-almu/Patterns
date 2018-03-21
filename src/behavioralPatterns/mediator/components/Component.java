package behavioralPatterns.mediator.components;

import behavioralPatterns.mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
