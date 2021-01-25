package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputArrayLength = scanner.nextInt();

        int[] array = new int[inputArrayLength];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }

        int countMoreThanEight = 0;
        int countEqualsOne = 0;
        int countEven = 0;
        int countOdd = 0;
        int arraySum = 0;
        for (int j : array) {
            if (j > 8) countMoreThanEight++;
            if (j == 1) countEqualsOne++;
            if (j % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

            arraySum += j;
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количестве чисел больше 8: " + countMoreThanEight);
        System.out.println("Количестве чисел равных 1: " + countEqualsOne);
        System.out.println("Количестве четных чисел: " + countEven);
        System.out.println("Количестве нечетных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + arraySum);
    }
}
