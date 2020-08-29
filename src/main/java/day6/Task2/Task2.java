package day6.Task2;

public class Task2 {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Airbus", 2015, 37, 200);
        plane1.setYearOfIssue(2017);
        plane1.setLength(34);
        plane1.fillUp(94);
        plane1.fillUp(149);
        plane1.info();
    }
}
