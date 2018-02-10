package structuralPatterns.composite.model;

import structuralPatterns.composite.api.Order;

import java.util.ArrayList;
import java.util.List;

public class Box implements Order {
    private List<Order> items = new ArrayList<Order>();

    public void addItem(Order item) {
        items.add(item);
    }

    public void clearBox() {
        items = new ArrayList<Order>();
    }

    @Override
    public Integer price() {
        Integer boxPrice = 0;
        for(Order item: items) {
            boxPrice += item.price();
        }

        return boxPrice;
    }

    @Override
    public void printName() {
        for(Order item: items) {
//            System.out.println();
            item.printName();
        }
    }
}
