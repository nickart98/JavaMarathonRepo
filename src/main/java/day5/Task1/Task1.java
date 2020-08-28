package day5.Task1;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfIssue(1992);
        car1.setColorOfCar("Black");
        car1.setModelOfCar("Mark II");
        System.out.println("Model: " + car1.getModelOfCar());
        System.out.println("Color: " + car1.getColorOfCar());
        System.out.println("Year of issue: " + car1.getYearOfIssue());
    }
}

class Car {
    private int year;
    private String color, model;

    public void setYearOfIssue(int yearOfIssue) {
        year = yearOfIssue;
    }

    public int getYearOfIssue() {
        return year;
    }

    public void setColorOfCar(String colorOfCar) {
        color = colorOfCar;
    }

    public String getColorOfCar() {
        return color;
    }

    public void setModelOfCar(String modelOfCar) {
        model = modelOfCar;
    }

    public String getModelOfCar() {
        return model;
    }
}
