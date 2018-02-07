package creationalPatterns.abstractFactory.furniture.modern;

import creationalPatterns.abstractFactory.furniture.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void using() {
        System.out.println("ModernSofa using");
    }
}
