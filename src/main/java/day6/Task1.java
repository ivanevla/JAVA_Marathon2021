package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2010);
        car.setColor("Blue");
        car.setModel("Audi");
        car.info();
        System.out.println(car.yearDifference(2000));

        Motorbike motorbike = new Motorbike("Yamaha", 2020, "red");
        motorbike.info();
        System.out.println(motorbike.yearDifference(2010));
    }
}
