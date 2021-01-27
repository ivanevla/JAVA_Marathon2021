package day8;

public class Task1 {
    public static void main(String[] args) {
        // Case1 - String
        long case1Start = System.nanoTime();

        String output1 = "0";
        for (int i = 1; i <= 20000; i++) {
            output1 = output1 + i + " ";
        }
        System.out.println(output1);
        long case1Finish = System.nanoTime();

        // Case2 - StringBuilder
        long case2Start = System.nanoTime();

        StringBuilder output2 = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
            output2.append(i).append(" ");
        }
        System.out.println(output2);
        long case2Finish = System.nanoTime();

        // Calculate result
        long case1Diff = case1Finish - case1Start;
        System.out.println("Case1 String: " + case1Diff);
        long case2Diff = case2Finish - case2Start;
        System.out.println("Case2 StringBuilder: " + case2Diff);
    }
}
