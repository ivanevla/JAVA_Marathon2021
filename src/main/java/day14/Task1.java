package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("D14T1_File.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersStringArray = line.split(" ");
            List<Integer> numbers = Arrays.stream(numbersStringArray)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            if (numbers.size() < 10) throw new IOException();

            Integer numbersSum = numbers.stream()
                    .reduce(0, Integer::sum);

            System.out.println(numbersSum);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Некорректный входной файл");
            e.printStackTrace();
        }
    }
}
