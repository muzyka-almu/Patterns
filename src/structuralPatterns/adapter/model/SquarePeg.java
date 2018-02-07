package structuralPatterns.adapter.model;

public class SquarePeg {
    private Double width;

    public Double getWidth() {
        return width;
    }

    public SquarePeg(Double width) {
        this.width = width;
    }

    public Double getSquare() {
        return Math.pow(width, 2);
    }
}
