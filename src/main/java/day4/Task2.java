package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int countEndsZero = 0;
        int sumEndsZero = 0;
        for (int el : array) {
            if (el > max) max = el;
            if (el < min) min = el;
            if (el % 10 == 0) {
                countEndsZero++;
                sumEndsZero += el;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + countEndsZero);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sumEndsZero);
    }
}
