package abstractFactory.furniture.modern;

import abstractFactory.furniture.Table;

public class ModernTable implements Table {
    @Override
    public void using() {
        System.out.println("ModernTable using");
    }
}
