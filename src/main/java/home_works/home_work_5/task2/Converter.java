package home_works.home_work_5.task2;

import java.util.ArrayList;
import java.util.List;

public class Converter {

    public List<Integer> toList(int[] numbersToConvert) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int number: numbersToConvert) {
            numbers.add(number);
        }
        return numbers;
    }
}
