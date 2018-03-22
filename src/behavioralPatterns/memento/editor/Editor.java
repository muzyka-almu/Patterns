package behavioralPatterns.memento.editor;

import behavioralPatterns.memento.command.Command;
import behavioralPatterns.memento.history.History;
import behavioralPatterns.memento.history.Memento;

import java.io.*;
import java.util.Base64;

public class Editor implements Serializable {
    public String title = "";
    public String select = "";
    private transient History history = new History();

    public void execute(Command<String> c) throws Exception {
        history.push(c, new Memento(this));
        c.execute();
    }

    public void undo() {
        history.undo();
    }

    public void redo() throws Exception {
        history.redo();
    }

    public String backup() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            oos.close();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException e) {
            return "";
        }
    }

    public void restore(String state) {
        try {
            byte[] data = Base64.getDecoder().decode(state);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            Editor editor = (Editor) ois.readObject();
            this.select = editor.select;
            this.title = editor.title;
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.print("ClassNotFoundException occurred.");
        } catch (IOException e) {
            System.out.print("IOException occurred.");
        }
    }

    @Override
    public String toString() {
        return "Editor{" +
                "title='" + title + '\'' +
                ", select='" + select + '\'' +
                '}';
    }
}
