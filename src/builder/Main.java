package builder;

import builder.builder.Director;
import builder.builder.ExpensiveCarBuilder;
import builder.builder.ExpensiveCarManualBuilder;

public class Main {
    public static void main(String ...args) {
        Director director = new Director();

        System.out.println("Expensive Car:");
        System.out.println();

        ExpensiveCarBuilder carBuilder = new ExpensiveCarBuilder();
        director.constructExpensiveCar(carBuilder);
        carBuilder.getResult().getCarInfo();

        System.out.println();
        System.out.println("Expensive Car Doc:");
        System.out.println();

        ExpensiveCarManualBuilder manualBuilder = new ExpensiveCarManualBuilder();
        director.constructExpensiveCar(manualBuilder);
        manualBuilder.getResult().showDoc();

        // TODO the same with constructCheepCar
    }
}
