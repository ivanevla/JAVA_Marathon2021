package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void incrementPickedOrdersCount() {
        countPickedOrders++;
    }

    public void incrementDeliveredOrdersCount() {
        countDeliveredOrders++;
    }

    @Override
    public String toString() {
        return "количество собранных заказов: " + this.countPickedOrders
                + ", количество доставленных заказов: " + this.countDeliveredOrders;
    }
}
