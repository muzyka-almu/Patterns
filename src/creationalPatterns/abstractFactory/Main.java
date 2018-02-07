package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.furniture.Chair;
import creationalPatterns.abstractFactory.furniture.FurnitureFactory;
import creationalPatterns.abstractFactory.furniture.Sofa;
import creationalPatterns.abstractFactory.furniture.Table;
import creationalPatterns.abstractFactory.furniture.artDecor.ArtDecorFurnitureFactory;
import creationalPatterns.abstractFactory.furniture.modern.ModernFurnitureFactory;
import creationalPatterns.abstractFactory.furniture.viktorian.ViktorianFurnitureFactory;

class Aplication {
    private Chair chair;
    private Sofa sofa;
    private Table table;

    Aplication(FurnitureFactory factory) {
        this.chair = factory.createChair();
        this.sofa = factory.createSofa();
        this.table = factory.createTable();
    }

    public void useChair() {
        this.chair.using();
    }

    public void useSofa() {
        this.sofa.using();
    }

    public void useTable() {
        this.table.using();
    }

    public void useAllFurniture() {
        this.useChair();
        this.useSofa();
        this.useTable();
    }
}

public class Main {

    public static void main(String ...args) {
        Aplication artDecorApplication = new Aplication(new ArtDecorFurnitureFactory());
        Aplication modernApplication = new Aplication(new ModernFurnitureFactory());
        Aplication viktorianApplication = new Aplication(new ViktorianFurnitureFactory());

        artDecorApplication.useAllFurniture();
        modernApplication.useAllFurniture();
        viktorianApplication.useAllFurniture();
    }
}
