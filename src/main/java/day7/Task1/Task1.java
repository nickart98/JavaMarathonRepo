package day7.Task1;

public class Task1 {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Airbus",2015, 38, 200);
        Plane plane2 = new Plane("Boeing", 2012, 37, 250);
        Plane.outputLongerPlane(plane1,plane2);
    }
}
