package day9.Task2;

public class Triangle extends Figure {
    private final double lengthA;
    private final double lengthB;
    private final double lengthC;

    public Triangle(double lengthA, double lengthB, double lengthC, String color) {
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    @Override
    public double area() {
        double halfPerimeter = perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.lengthA) *
                (halfPerimeter - this.lengthB) * (halfPerimeter - this.lengthC));
    }

    @Override
    public double perimeter() {
        return this.lengthA + this.lengthB + this.lengthC;
    }
}
