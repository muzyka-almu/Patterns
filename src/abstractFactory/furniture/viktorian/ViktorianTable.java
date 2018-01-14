package abstractFactory.furniture.viktorian;

import abstractFactory.furniture.Table;

public class ViktorianTable implements Table {
    @Override
    public void using() {
        System.out.println("ViktorianTable using");
    }
}
