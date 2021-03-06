package creationalPatterns.builder.builder;

import creationalPatterns.builder.model.Engine;
import creationalPatterns.builder.model.GPS;
import creationalPatterns.builder.model.Manual;
import creationalPatterns.builder.model.TripComputer;

public class ExpensiveCarManualBuilder implements Builder {
    private Manual manual;

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(Integer number) {
        manual.addDoc("Seat number " + number);
    }

    @Override
    public void setEngine(Engine engine) {
        manual.addDoc(engine.getInfo());
    }

    @Override
    public void setTripComputer(TripComputer computer) {
        manual.addDoc(computer.getInfo());
    }

    @Override
    public void setGPS(GPS gps) {
        manual.addDoc(gps.getInfo());
    }

    public Manual getResult() {
        return manual;
    }
}
