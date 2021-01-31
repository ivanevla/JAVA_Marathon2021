package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> marks = new ArrayList<>(
                Arrays.asList("Audi", "BMW", "OPEL", "SUBARU", "HONDA")
        );

        int index = marks.size() / 2 + 1;
        marks.add(index, "MAZDA");

        marks.remove(0);

        marks.forEach(System.out::println);
    }
}
