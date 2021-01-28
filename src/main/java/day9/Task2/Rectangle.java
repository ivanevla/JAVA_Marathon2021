package day9.Task2;

public class Rectangle extends Figure {
    private final double width;
    private final double length;

    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return this.width * this.length;
    }

    @Override
    public double perimeter() {
        return 2 * (this.width + this.length);
    }
}
