package creationalPatterns.abstractFactory.furniture.modern;

import creationalPatterns.abstractFactory.furniture.Chair;
import creationalPatterns.abstractFactory.furniture.FurnitureFactory;
import creationalPatterns.abstractFactory.furniture.Sofa;
import creationalPatterns.abstractFactory.furniture.Table;

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
