package abstractFactory.furniture.modern;

import abstractFactory.furniture.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void using() {
        System.out.println("ModernSofa using");
    }
}
