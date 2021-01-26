package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        int length1 = airplane1.length;
        int length2 = airplane2.length;

        String message;
        if (length1 > length2)
            message = "Первый самолет длиннее";
        else if (length2 > length1)
            message = "Второй самолет длиннее";
        else
            message = "Длины самолетов равны";

        System.out.println(message);
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + this.producer
                + ", год выпуска: " + this.year
                + ", длина: " + this.length + ", вес: " + this.weight
                + ", количество топлива в баке: " + this.fuel);
    }

    public void fillUp(int n) {
        this.fuel += n;
    }
}
