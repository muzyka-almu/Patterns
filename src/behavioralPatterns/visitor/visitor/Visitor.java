package behavioralPatterns.visitor.visitor;

import behavioralPatterns.visitor.shapes.Circle;
import behavioralPatterns.visitor.shapes.Rectangle;

public interface Visitor {
    public String visitCircle(Circle circle);
    public String visitRectangle(Rectangle rectangle);
}
