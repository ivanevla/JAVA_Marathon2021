package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Yamaha", 2020, "red");

        System.out.println(motorbike.getModel());
        System.out.println(motorbike.getYear());
        System.out.println(motorbike.getColor());
    }
}
