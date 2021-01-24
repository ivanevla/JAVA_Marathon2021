package day5;

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
}
