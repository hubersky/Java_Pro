package home_works.home_work5.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 10));
        }
        Unique unique = new Unique();
        System.out.println(unique.findUnique(numbers));
    }
}
