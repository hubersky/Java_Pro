package home_works.home_work5.task4;

import java.util.*;

public class Occurrence {

    public void calcOccurrence(List<String> cars) {
        Set<String> result = new HashSet<>();
        int counter = 0;
        for (String check : cars) {
            for (String word : cars) {
                if (check.equals(word)) {
                    counter += 1;
                }
            }
            result.add("The word " + check + " occurrence:" + counter + " times");
            counter = 0;
        }
        for (String word: result) {
            System.out.println(word);
        }
    }

    public Map<String, String> findOccurrence(List<String> cars) {
        Map<String,String> result = new HashMap<>();
        int counter = 0;
        for (String check : cars) {
            for (String word : cars) {
                if (check.equals(word)) {
                    counter += 1;
                }
            }
            result.put(check, "occurrence:" + counter + " times");
            counter = 0;
        }
        return result;
    }
}
