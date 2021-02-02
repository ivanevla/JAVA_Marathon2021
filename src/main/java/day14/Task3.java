package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("D14T2_people.txt");
        List<Person> personList = parseFileToObjList(file);
        System.out.println(personList);
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> personList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] stringsArray = scanner.nextLine().split(" ");
                String name = stringsArray[0];
                int year = Integer.parseInt(stringsArray[1]);
                if (year < 0) throw new IOException();

                personList.add(new Person(name, year));
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
