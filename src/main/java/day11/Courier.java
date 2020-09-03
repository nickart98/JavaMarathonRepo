package day11;

public class Courier implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary+=100;
        warehouse.balance+=1000;
    }

    @Override
    public void bonus() {
        if (warehouse.balance>=1000000)
            salary*=2;
        System.out.println("Зарплата курьера: " + salary);
    }


}
