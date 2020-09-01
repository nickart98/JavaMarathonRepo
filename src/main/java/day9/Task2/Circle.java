package day9.Task2;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double perimeter() {
        return radius * 2 * Math.PI;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
