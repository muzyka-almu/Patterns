package abstractFactory.furniture.artDecor;

import abstractFactory.furniture.Chair;

public class ArtDecorChair implements Chair {
    @Override
    public void using() {
        System.out.println("ArtDecorChair using");
    }
}
