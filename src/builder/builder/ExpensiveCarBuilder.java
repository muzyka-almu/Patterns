package builder.builder;

import builder.model.Car;
import builder.model.Engine;
import builder.model.GPS;
import builder.model.TripComputer;

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
