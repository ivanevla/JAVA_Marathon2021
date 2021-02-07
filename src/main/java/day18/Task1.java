package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        int sum = recursionSum(numbers, 0);

        System.out.println(sum);
    }

    public static int recursionSum(int[] numbers, int idx) {
        if (idx == numbers.length) return 0;

        return numbers[idx] + recursionSum(numbers, ++idx);
    }
}
