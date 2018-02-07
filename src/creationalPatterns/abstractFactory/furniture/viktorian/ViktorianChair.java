package creationalPatterns.abstractFactory.furniture.viktorian;

import creationalPatterns.abstractFactory.furniture.Chair;

public class ViktorianChair implements Chair {
    @Override
    public void using() {
        System.out.println("ViktorianChair using");
    }
}
