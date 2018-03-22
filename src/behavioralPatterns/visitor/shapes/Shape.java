package behavioralPatterns.visitor.shapes;

import behavioralPatterns.visitor.visitor.Visitor;

public interface Shape {
    public void move(int x, int y);
    public void draw();
    public String accept(Visitor visitor);
}
