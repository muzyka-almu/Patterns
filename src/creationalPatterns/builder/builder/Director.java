package creationalPatterns.builder.builder;

import creationalPatterns.builder.model.Engine;
import creationalPatterns.builder.model.GPS;
import creationalPatterns.builder.model.TripComputer;

public class Director {
    public void constructExpensiveCar(Builder builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine(new Engine());
        builder.setGPS(new GPS());
        builder.setTripComputer(new TripComputer());
    }

    public void constructCheepCar(Builder builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine(new Engine());
    }
}
