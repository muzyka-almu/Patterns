package behavioralPatterns.visitor.shapes;

import behavioralPatterns.visitor.visitor.Visitor;

public class Circle implements Shape {
    public int id;
    public int x;
    public int y;
    public int radius;

    public Circle(int id, int x, int y, int radius) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("moving shape.....");
    }

    @Override
    public void draw() {
        System.out.println("drawing shape.....");
    }

    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getId() {
        return id;
    }

    public int getRadius() {
        return radius;
    }
}
