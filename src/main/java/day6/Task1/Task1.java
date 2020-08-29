package day6.Task1;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfIssue(1992);
        car1.carDescription();
        System.out.println(car1.carDifference(2020));
        Motorbike motorbike1 = new Motorbike(2010,"Ducati","Black");
        motorbike1.mbDescription();
        System.out.println(motorbike1.mbDifference(2020));
    }
}
