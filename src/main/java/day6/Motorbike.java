package day6;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - this.year);
    }
}
