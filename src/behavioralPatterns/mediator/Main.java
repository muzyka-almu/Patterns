package behavioralPatterns.mediator;

import behavioralPatterns.mediator.components.AddButton;
import behavioralPatterns.mediator.components.Component;
import behavioralPatterns.mediator.components.List;
import behavioralPatterns.mediator.components.Title;
import behavioralPatterns.mediator.mediator.Editor;
import behavioralPatterns.mediator.mediator.Mediator;

public class Main {
    public static void main(String[] args){
        // config ========================================= start
        Mediator mediator = new Editor();

        List list = new List(mediator);
        Title title = new Title(mediator);
        AddButton addButton = new AddButton(mediator);

        mediator.registerComponent(list);
        mediator.registerComponent(title);
        mediator.registerComponent(addButton);
        // config ========================================= end

        // On UI side :
        addButton.click();
        title.setText("Note 1: some info");
        addButton.click();
        title.setText("Note 2: some more impotent info)");
        addButton.click();
        // Instead of display:
        System.out.println("UI info:");
        System.out.println(mediator.getUIInfo());

    }
}
