package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }

        int maxIndex = 0;
        int maxSum = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int tempSum = 0;
            int k = 2;
            for (int j = i; j < i + k; j++) {
                tempSum += array[j];
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
                maxIndex = i;
            }
        }

        System.out.println(maxSum);
        System.out.println(Arrays.toString(Arrays.copyOfRange(array, maxIndex, maxIndex + 3)));
    }
}
