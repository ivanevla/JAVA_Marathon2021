package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        if (numA >= numB) {
            System.out.println("Некорректный ввод");
            return;
        }

        ++numA;
        while (numA < numB) {
            if (numA % 5 == 0 && !(numA % 10 == 0)) System.out.printf("%d ", numA);
            numA++;
        }
    }
}
