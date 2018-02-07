package structuralPatterns.adapter.model;

public class RoundPeg {
    private Double radius;

    public Double getRadius() {
        return radius;
    }

    public RoundPeg(){}

    public RoundPeg(Double radius) {
        this.radius = radius;
    }
}
