package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("D16T2_File1.txt");
        File file2 = new File("D16T2_File2.txt");

        createFile(file1);
        createFile(file2);

        generateFirstFile(file1);
        generateSecondFile(file2, file1);

        printResult(file2);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String[] numbersStringArray = scanner.nextLine().split(" ");
            double sum = Arrays.stream(numbersStringArray)
                    .map(Double::parseDouble)
                    .reduce(0.0, Double::sum);
            System.out.println((int) sum);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }

    private static void generateFirstFile(File file) {
        try {
//            PrintWriter printWriter = new PrintWriter(file);
//            Random random = new Random();
//            for (int i = 0; i < 1000; i++) {
//                int randomNumber = random.nextInt(100);
//                printWriter.printf("%d ", randomNumber);
//            }

            PrintWriter printWriter = new PrintWriter(file);
            IntStream.generate(() -> ThreadLocalRandom.current().nextInt(100))
                    .limit(1000)
                    .forEach(value -> printWriter.printf("%d ", value));
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }

    private static void generateSecondFile(File file2, File file1) {
        try {
            Scanner scanner = new Scanner(file1);
            PrintWriter printWriter = new PrintWriter(file2);

            String[] numbersStringArray = scanner.nextLine().split(" ");
            List<String> numbersStringList = Arrays.asList(numbersStringArray);
            int cutSize = 20;

            IntStream.range(0, numbersStringList.size() / cutSize)
                    .mapToObj(i -> numbersStringList.subList(i * cutSize, Math.min(cutSize * (i + 1), numbersStringList.size())))
                    .collect(Collectors.toList())
                    .forEach(array -> {
                        double sum = array.stream().map(Double::parseDouble).reduce(Double::sum).get();
                        double average = sum / array.size();
                        printWriter.printf("%s ", average);
                    });
            printWriter.close();

//            String[] numbersStringArray = scanner.nextLine().split(" ");
//            int cutSize = 20;
//            double sum = 0;
//            for (int i = 1; i <= numbersStringArray.length; i++) {
//                sum += Integer.parseInt(numbersStringArray[i-1]);
//                if (i % cutSize == 0) {
//                    double average = sum / cutSize;
//                    printWriter.printf("%s ", average);
//                    sum = 0;
//                }
//            }
//            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }

    private static void createFile(File file) {
        try {
            file.delete();
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
