package day1;

public class Task6 {
    public static void main(String[] args) {
        int k = 3;
        for (int i = 1; i <= 9; i++) {
            int multiplicationResult = k * i;
            System.out.printf("%d x %d = %d%n", i, k, multiplicationResult);
        }
    }
}
