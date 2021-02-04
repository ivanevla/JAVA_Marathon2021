package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("D16T1_File.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String[] numbersStringArray = scanner.nextLine().split(" ");
            Double sum = Arrays.stream(numbersStringArray)
                    .map(Double::parseDouble)
                    .reduce(0.0, Double::sum);
            double result = sum / numbersStringArray.length;
            System.out.printf("%s --> %.3f", result, result);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}

