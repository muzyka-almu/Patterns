package creationalPatterns.abstractFactory.furniture.artDecor;

import creationalPatterns.abstractFactory.furniture.Chair;
import creationalPatterns.abstractFactory.furniture.FurnitureFactory;
import creationalPatterns.abstractFactory.furniture.Sofa;
import creationalPatterns.abstractFactory.furniture.Table;

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
