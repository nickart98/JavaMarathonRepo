package day9.Task2;

public class Rectangle extends Figure {
    private double height, width;

    public Rectangle(double height, double width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public double perimeter() {
        return (height + width) * 2;
    }

    public double area() {
        return height * width;
    }
}
