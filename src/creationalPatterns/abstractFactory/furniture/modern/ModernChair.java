package creationalPatterns.abstractFactory.furniture.modern;

import creationalPatterns.abstractFactory.furniture.Chair;

public class ModernChair implements Chair {
    @Override
    public void using() {
        System.out.println("ModernChair using");
    }
}
