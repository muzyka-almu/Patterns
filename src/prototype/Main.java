package prototype;

public class Main {
    public static void main(String ...args) {
        Rectangle r = new Rectangle();
        r.setY(5);
        r.setX(5);
        r.setY1(15);
        r.setX1(20);
        System.out.println(r.toString());
        System.out.println();

        Shape otherRectangle = r.clone();
        System.out.println(otherRectangle.toString());
        System.out.println();


        Circle c = new Circle();
        c.setY(20);
        c.setX(20);
        c.setRadius(15);
        System.out.println(c.toString());
        System.out.println();

        Shape otherCircle = c.clone();
        System.out.println(otherCircle.toString());
    }
}
