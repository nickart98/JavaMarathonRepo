package day7.Task1;

public class Plane {
    private String manufacturer;
    private int yearOfIssue, length, weight, valueOfFuel = 0;

    public Plane(String manufacturer, int yearOfIssue, int length, int weight) {
        this.manufacturer = manufacturer;
        this.yearOfIssue = yearOfIssue;
        this.length = length;
        this.weight = weight;
    }

    void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + yearOfIssue + ", длина: " + length + ", вес: " + weight + ", объем топлива в баке: " + valueOfFuel);
    }

    void fillUp(int litres) {
        valueOfFuel += litres;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValueOfFuel() {
        return valueOfFuel;
    }

    public void setValueOfFuel(int valueOfFuel) {
        this.valueOfFuel = valueOfFuel;
    }

    public static void outputLongerPlane(Plane plane1,Plane plane2){
        if (plane1.getLength() > plane2.getLength())
            System.out.println("Самолет 1 длиннее");
        if (plane1.getLength() < plane2.getLength())
            System.out.println("Самолет 2 длиннее");
        else
            System.out.println("Длины обоих самолетов равны");
    }
}
