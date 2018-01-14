package builder.model;

public class Car {
    private Engine engine;
    private GPS gps;
    private TripComputer tripComputer;
    private Integer seats;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GPS getGps() {
        return gps;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public void getCarInfo() {
        System.out.println("Car have:");

        if (seats != null) {
            System.out.println("-Seats count " + seats);
        }

        if (engine != null) {
            System.out.println("-Engine");
        }

        if (gps != null) {
            System.out.println("-GPS");
        }

        if (tripComputer != null) {
            System.out.println("-Trip computer");
        }
    }
}
