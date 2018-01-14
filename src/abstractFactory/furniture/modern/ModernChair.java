package abstractFactory.furniture.modern;

import abstractFactory.furniture.Chair;

public class ModernChair implements Chair {
    @Override
    public void using() {
        System.out.println("ModernChair using");
    }
}
