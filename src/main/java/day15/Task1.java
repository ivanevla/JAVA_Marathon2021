package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {
        String inputPath = "src/main/resources/shoes.csv";
        String outputPath = "D15T1_missing_shoes.txt";

        List<Shoes> shoesList = readCsvFile(inputPath);
        List<Shoes> shoesWithCountZero = filterShoesWithCountZero(shoesList);
        writeTxtFile(outputPath, shoesWithCountZero);
    }

    private static List<Shoes> readCsvFile(String inputPath) {
        List<Shoes> shoesList = new ArrayList<>();
        try {
            File file = new File(inputPath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] lineArray = scanner.nextLine().split(";");
                String name = lineArray[0];
                int size = Integer.parseInt(lineArray[1]);
                int count = Integer.parseInt(lineArray[2]);

                shoesList.add(new Shoes(name, size, count));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
        return shoesList;
    }

    private static List<Shoes> filterShoesWithCountZero(List<Shoes> shoesList) {
        return shoesList.stream()
                .filter(shoes -> shoes.getCount() == 0)
                .collect(Collectors.toList());
    }

    private static void writeTxtFile(String outputPath, List<Shoes> shoesList) {
        try {
            File file = new File(outputPath);
            PrintWriter printWriter = new PrintWriter(file);
            shoesList.forEach(shoes ->
                    printWriter.printf("%s, %d, %d%n", shoes.getName(), shoes.getSize(), shoes.getCount()));
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
