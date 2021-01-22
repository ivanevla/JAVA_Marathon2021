package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            double numA = scanner.nextDouble();
            double numB = scanner.nextDouble();

            if (numB == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            double result = numA / numB;
            System.out.println(result);
        }
    }
}
