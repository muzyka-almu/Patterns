package behavioralPatterns.visitor.shapes;

import behavioralPatterns.visitor.visitor.Visitor;

public class Rectangle implements Shape {
    public int id;
    public int x;
    public int y;
    public int width;
    public int height;

    public Rectangle(int id, int x, int y, int width, int height) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitRectangle(this);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("moving shape.....");
    }

    @Override
    public void draw() {
        System.out.println("drawing shape.....");
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
