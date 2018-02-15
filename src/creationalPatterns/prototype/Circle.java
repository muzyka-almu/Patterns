package creationalPatterns.prototype;

public class Circle extends Shape {
    private Integer radius;

    public Circle(){
    }

    public Circle(Circle circle) {
        super(circle);

        if (circle != null) {
            this.radius = circle.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                ",radius=" + radius +
                '}';
    }
}
