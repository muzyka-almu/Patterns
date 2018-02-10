package structuralPatterns.composite.model;

import structuralPatterns.composite.api.Order;

public class Tv implements Order {
    @Override
    public void printName() {
        System.out.println("Tv");
    }

    @Override
    public Integer price() {
        return 1000;
    }
}
