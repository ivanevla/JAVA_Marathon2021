package day11.task1;

public class Courier implements Worker {
    private static final int FIXEDSALARY = 100;
    private static final int BONUSCOUNT = 10000;
    private static final int BONUSSALARY = 50000;
    private final Warehouse warehouse;
    private int salary;
    private boolean isPayed;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "заработная плата: " + this.salary + ", был выплачен бонус: " + this.isPayed;
    }

    @Override
    public void doWork() {
        this.warehouse.incrementDeliveredOrdersCount();
        this.salary += FIXEDSALARY;
    }

    @Override
    public void bonus() {
        if (this.warehouse.getCountDeliveredOrders() < BONUSCOUNT) {
            System.out.println("Бонус пока не доступен");
        } else {
            this.isPayed = true;
            this.salary += BONUSSALARY;
            System.out.println("Бонус уже был выплачен");
        }
    }
}
