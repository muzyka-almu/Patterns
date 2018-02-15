package creationalPatterns.builder.builder;

import creationalPatterns.builder.model.Engine;
import creationalPatterns.builder.model.GPS;
import creationalPatterns.builder.model.TripComputer;

public interface Builder {
    void reset();
    void setSeats(Integer number);
    void setEngine(Engine engine);
    void setTripComputer(TripComputer computer);
    void setGPS(GPS gps);
}
