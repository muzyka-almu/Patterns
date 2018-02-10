package structuralPatterns.composite.model;

import structuralPatterns.composite.api.Order;

public class Radio implements Order {
    @Override
    public void printName() {
        System.out.println("Radio");
    }

    @Override
    public Integer price() {
        return 100;
    }
}
