package abstractFactory.furniture.viktorian;

import abstractFactory.furniture.Chair;

public class ViktorianChair implements Chair {
    @Override
    public void using() {
        System.out.println("ViktorianChair using");
    }
}
