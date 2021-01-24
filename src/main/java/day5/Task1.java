package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2010);
        car.setColor("Blue");
        car.setModel("Audi");

        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getColor());
    }
}
