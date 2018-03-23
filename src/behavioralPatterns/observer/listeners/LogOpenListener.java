package behavioralPatterns.observer.listeners;

public class LogOpenListener implements EventListener {
    private String log;

    public LogOpenListener(String fileName) {
        this.log = fileName;
    }

    @Override
    public void update(String eventType, String file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file);
    }
}
