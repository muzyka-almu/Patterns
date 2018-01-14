package abstractFactory.furniture.modern;

import abstractFactory.furniture.Chair;
import abstractFactory.furniture.FurnitureFactory;
import abstractFactory.furniture.Sofa;
import abstractFactory.furniture.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
