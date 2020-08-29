package day6.Task1;

class Motorbike {
    private int year;
    private String model, color;

    Motorbike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }
    void mbDescription(){
        System.out.println("Это мотоцикл");
    }
    int mbDifference(int yearNew){
        return yearNew - year;
    }
}
