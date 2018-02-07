package creationalPatterns.abstractFactory.furniture.viktorian;

import creationalPatterns.abstractFactory.furniture.Sofa;

public class ViktorianSofa implements Sofa {
    @Override
    public void using() {
        System.out.println("ViktorianSofa using");
    }
}
