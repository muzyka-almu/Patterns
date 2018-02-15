package creationalPatterns.prototype;

public class Rectangle extends Shape {
    private Integer x1;
    private Integer y1;

    public Rectangle() {
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);

        if (rectangle != null) {
            this.x1 = rectangle.x1;
            this.y1 = rectangle.y1;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public Integer getX1() {
        return x1;
    }

    public void setX1(Integer x1) {
        this.x1 = x1;
    }

    public Integer getY1() {
        return y1;
    }

    public void setY1(Integer y1) {
        this.y1 = y1;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                ", x1=" + x1 +
                ", y1=" + y1 +
                '}';
    }
}
