package abstractFactory.furniture.artDecor;

import abstractFactory.furniture.Table;

public class ArtDecorTable implements Table {
    @Override
    public void using() {
        System.out.println("ArtDecorTable using");
    }
}
