package abstractFactory.furniture.viktorian;

import abstractFactory.furniture.Chair;
import abstractFactory.furniture.FurnitureFactory;
import abstractFactory.furniture.Sofa;
import abstractFactory.furniture.Table;

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
