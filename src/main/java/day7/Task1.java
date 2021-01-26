package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus", 2015, 10000, 40000);
        Airplane airplane2 = new Airplane("Boeing", 2007, 20000, 30000);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}