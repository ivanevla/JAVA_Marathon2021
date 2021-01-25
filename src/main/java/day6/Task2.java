package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2015, 10000, 40000);
        airplane.setYear(2016);
        airplane.setLength(20000);
        airplane.fillUp(100);
        airplane.info();
    }
}
