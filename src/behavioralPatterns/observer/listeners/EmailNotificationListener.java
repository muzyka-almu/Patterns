package behavioralPatterns.observer.listeners;

public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file);
    }
}
