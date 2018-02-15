package structuralPatterns.flyweight.model;

import java.awt.*;

public class TreeType {
    private String name;
    private Color color;

    public TreeType(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public void draw(Integer x, Integer y) {
        System.out.println("TreeType{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", x='" + x + '\'' +
                ", y='" + y + '\'' +
                '}');
    }
}
