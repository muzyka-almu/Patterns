package creationalPatterns.abstractFactory.furniture.viktorian;

import creationalPatterns.abstractFactory.furniture.Chair;
import creationalPatterns.abstractFactory.furniture.FurnitureFactory;
import creationalPatterns.abstractFactory.furniture.Sofa;
import creationalPatterns.abstractFactory.furniture.Table;

public class ViktorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ViktorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new ViktorianSofa();
    }

    @Override
    public Table createTable() {
        return new ViktorianTable();
    }
}
