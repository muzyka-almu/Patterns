package behavioralPatterns.observer.editor;

import behavioralPatterns.observer.publisher.EventManager;

public class Editor {
    public EventManager events;
    private String file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = filePath;
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
