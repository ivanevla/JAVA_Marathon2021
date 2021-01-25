package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(51);
            }
        }

        int maxSum = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int tempSum = 0;
            for (int j = 0; j < array[i].length; j++) {
                tempSum += array[i][j];
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
                maxIndex = i;
            }
        }

        System.out.println("Ответ: " + maxIndex);
    }
}
