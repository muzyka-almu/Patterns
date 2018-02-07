package creationalPatterns.abstractFactory.furniture.artDecor;

import creationalPatterns.abstractFactory.furniture.Chair;

public class ArtDecorChair implements Chair {
    @Override
    public void using() {
        System.out.println("ArtDecorChair using");
    }
}
