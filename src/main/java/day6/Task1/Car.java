package day6.Task1;

public class Car {
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

    void carDescription() {
        System.out.println("Это автомобиль");
    }

    int carDifference(int yearNew) {
        return yearNew - year;
    }
}
