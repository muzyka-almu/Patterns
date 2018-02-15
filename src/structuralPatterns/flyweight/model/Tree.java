package structuralPatterns.flyweight.model;

public class Tree {
    private Integer x;
    private Integer y;
    private TreeType type;

    public Tree(Integer x, Integer y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        type.draw(x, y);
    }
}