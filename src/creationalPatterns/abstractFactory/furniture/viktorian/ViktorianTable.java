package creationalPatterns.abstractFactory.furniture.viktorian;

import creationalPatterns.abstractFactory.furniture.Table;

public class ViktorianTable implements Table {
    @Override
    public void using() {
        System.out.println("ViktorianTable using");
    }
}
