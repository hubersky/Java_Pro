package home_works.home_work5.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 10, 45, 12, 3};
        Convert convert = new Convert();
        List<Integer> newList = convert.toList(numbers);
        System.out.println(newList);
    }
}