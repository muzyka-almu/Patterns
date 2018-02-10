package structuralPatterns.composite;

import structuralPatterns.composite.model.Box;
import structuralPatterns.composite.model.Phone;
import structuralPatterns.composite.model.Radio;
import structuralPatterns.composite.model.Tv;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Radio radio = new Radio();
        Tv tv = new Tv();

        Box chinaOrder = new Box();
        chinaOrder.addItem(phone);
        chinaOrder.addItem(radio);

        System.out.println();
        System.out.println("China order:");
        chinaOrder.printName();
        System.out.println("Price: " + chinaOrder.price());
        System.out.println("--------------------------------");
        System.out.println();

        Box mainOrder = new Box();
        mainOrder.addItem(chinaOrder);
        mainOrder.addItem(tv);

        System.out.println();
        System.out.println("Main order:");
        mainOrder.printName();
        System.out.println("Price: " + mainOrder.price());
        System.out.println("--------------------------------");
        System.out.println();
    }
}
