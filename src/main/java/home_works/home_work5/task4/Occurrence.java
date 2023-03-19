package home_works.home_work5.task4;

import java.util.*;

public class Occurrence {

    public void calcOccurrence(List<String> list) {
        Set<String> result = new HashSet<>();
        int count = 0;
        for (String check : list) {
            for (String word : list) {
                if (check.equals(word)) {
                    count += 1;
                }
            }
            result.add("The word " + check + " occurrence:" + count + " times");
            count = 0;
        }
        for (String word: result) {
            System.out.println(word);
        }
    }

    public Map<String, String> findOccurrence(List<String> list) {
        Map<String,String> result = new HashMap<>();
        int count = 0;
        for (String check : list) {
            for (String word : list) {
                if (check.equals(word)) {
                    count += 1;
                }
            }
            result.put(check, "occurrence:" + count + " times");
            count = 0;
        }
        return result;
    }
}
