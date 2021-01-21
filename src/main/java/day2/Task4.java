package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        double result = 420.0;

        if (input >= 5) {
            result = (Math.pow(input, 2) - 10) / (input + 7);
        } else if (input > -3 && input < 5) {
            result = (input + 3) * (Math.pow(input, 2) - 2);
        }

        System.out.println(result);
    }
}
