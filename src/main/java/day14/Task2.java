package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("D14T2_people.txt");
        List<String> lines = parseFileToStringList(file);
        System.out.println(lines);
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> personList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] stringsArray = scanner.nextLine().split(" ");
                int year = Integer.parseInt(stringsArray[1]);
                if (year < 0) throw new IOException();

                personList.add(String.format("%s %s", stringsArray[0], stringsArray[1]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
            e.printStackTrace();
        }
        return personList;
    }
}
