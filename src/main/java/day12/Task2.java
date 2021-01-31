package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(80);

        for (int i = 0; i < 30; i++) list.add(i);
        for (int i = 300; i < 350; i++) list.add(i);

        list.forEach(System.out::println);
    }
}
