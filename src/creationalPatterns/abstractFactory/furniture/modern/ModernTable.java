package creationalPatterns.abstractFactory.furniture.modern;

import creationalPatterns.abstractFactory.furniture.Table;

public class ModernTable implements Table {
    @Override
    public void using() {
        System.out.println("ModernTable using");
    }
}
