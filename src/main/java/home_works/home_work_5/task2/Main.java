package home_works.home_work_5.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 10, 45, 12, 3};
        Converter converter = new Converter();
        List<Integer> convertNumbers = converter.toList(numbers);
        System.out.println(convertNumbers);
    }
}
