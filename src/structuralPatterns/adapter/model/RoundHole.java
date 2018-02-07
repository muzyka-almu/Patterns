package structuralPatterns.adapter.model;

public class RoundHole {
    private Double radius;

    public Double getRadius() {
        return radius;
    }

    public RoundHole(Double radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg) {
        return radius >= peg.getRadius();
    }
}
