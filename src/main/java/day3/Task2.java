package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (true) {
            double numA = scanner.nextDouble();
            double numB = scanner.nextDouble();

            if (numB == 0) break;

            double result = numA / numB;
            System.out.println(result);
        }
    }
}
