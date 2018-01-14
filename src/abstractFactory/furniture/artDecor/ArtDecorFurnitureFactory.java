package abstractFactory.furniture.artDecor;

import abstractFactory.furniture.Chair;
import abstractFactory.furniture.FurnitureFactory;
import abstractFactory.furniture.Sofa;
import abstractFactory.furniture.Table;

public class ArtDecorFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecorChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecorSofa();
    }

    @Override
    public Table createTable() {
        return new ArtDecorTable();
    }
}
