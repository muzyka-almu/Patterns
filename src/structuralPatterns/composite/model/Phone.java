package structuralPatterns.composite.model;

import structuralPatterns.composite.api.Order;

public class Phone implements Order {
    public void printName() {
        System.out.println("Phone");
    }

    @Override
    public Integer price() {
        return 500;
    }
}
