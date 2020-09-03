package day11;

public class Picker implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }


    @Override
    public void doWork() {
        warehouse.countOrder++;
        salary += 80;
    }

    @Override
    public void bonus() {
        if (warehouse.countOrder >= 1500)
            salary *= 3;
        System.out.println("Зарплата сборщика: " + salary);
    }

}
