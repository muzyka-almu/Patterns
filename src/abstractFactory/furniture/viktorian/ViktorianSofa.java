package abstractFactory.furniture.viktorian;

import abstractFactory.furniture.Sofa;

public class ViktorianSofa implements Sofa {
    @Override
    public void using() {
        System.out.println("ViktorianSofa using");
    }
}
