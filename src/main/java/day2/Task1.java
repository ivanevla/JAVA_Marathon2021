package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input >= 1 && input <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (input >= 5 && input <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (input > 8) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
