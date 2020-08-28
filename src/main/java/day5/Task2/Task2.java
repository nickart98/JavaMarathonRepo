package day5.Task2;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike(2010, "Yamaha", "Black");
    }
}

class Motorbike {
    private int year;
    private String model, color;

    Motorbike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

}
