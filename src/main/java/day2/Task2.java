package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        if (numA >= numB) {
            System.out.println("Некорректный ввод");
        }

        for (int i = ++numA; i < numB; i++) {
            if (i % 5 == 0 && i % 10 != 0) System.out.printf("%d ", i);
        }
    }
}
