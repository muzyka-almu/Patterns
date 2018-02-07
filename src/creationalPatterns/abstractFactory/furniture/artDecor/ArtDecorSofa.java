package creationalPatterns.abstractFactory.furniture.artDecor;

import creationalPatterns.abstractFactory.furniture.Sofa;

public class ArtDecorSofa implements Sofa {
    @Override
    public void using() {
        System.out.println("ArtDecorSofa using");
    }
}
