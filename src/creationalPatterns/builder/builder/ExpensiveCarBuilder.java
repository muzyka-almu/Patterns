package creationalPatterns.builder.builder;

import creationalPatterns.builder.model.Car;
import creationalPatterns.builder.model.Engine;
import creationalPatterns.builder.model.GPS;
import creationalPatterns.builder.model.TripComputer;

public class ExpensiveCarBuilder implements Builder {
    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(Integer number) {
        car.setSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(TripComputer computer) {
        car.setTripComputer(new TripComputer());
    }

    @Override
    public void setGPS(GPS gps) {
        car.setGps(gps);
    }

    public Car getResult() {
        return car;
    }
}
