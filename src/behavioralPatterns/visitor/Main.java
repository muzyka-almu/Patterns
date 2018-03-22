package behavioralPatterns.visitor;

import behavioralPatterns.visitor.shapes.Circle;
import behavioralPatterns.visitor.shapes.Rectangle;
import behavioralPatterns.visitor.visitor.XMLExportVisitor;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(circle, rectangle));
    }
}
