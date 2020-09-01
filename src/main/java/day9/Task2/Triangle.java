package day9.Task2;

public class Triangle extends Figure {
    private double lengthAB, lengthBC, lengthAC;

    public Triangle(double lengthAB, double lengthBC, double lengthAC, String color) {
        super(color);
        this.lengthAB = lengthAB;
        this.lengthBC = lengthBC;
        this.lengthAC = lengthAC;
    }

    public double perimeter() {
        return lengthAB + lengthBC + lengthAC;
    }

    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - lengthAB) * (p - lengthBC) * (p - lengthAC));
    }
}
