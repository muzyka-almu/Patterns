package behavioralPatterns.mediator.model;

public class Note {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Note{" +
                "name='" + name + '\'' +
                '}';
    }
}
