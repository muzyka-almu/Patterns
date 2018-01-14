package builder.builder;

import builder.model.Engine;
import builder.model.GPS;
import builder.model.TripComputer;

public interface Builder {
    void reset();
    void setSeats(Integer number);
    void setEngine(Engine engine);
    void setTripComputer(TripComputer computer);
    void setGPS(GPS gps);
}
