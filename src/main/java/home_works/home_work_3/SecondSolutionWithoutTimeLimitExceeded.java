package home_works.home_work_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondSolutionWithoutTimeLimitExceeded {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        List<Character> firstArr = new ArrayList<>();
        List<Character> secondArr = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            firstArr.add(ch);
        }
        for (char ch : t.toCharArray()) {
            secondArr.add(ch);
        }
        for (int i = 0; i < firstArr.size();) {
            char check = firstArr.get(i);
            if (!secondArr.contains(check)) return false;
            secondArr.removeAll(Collections.singleton(firstArr.get(i)));
            firstArr.removeAll(Collections.singleton(firstArr.get(i)));
            if (firstArr.size() != secondArr.size()) return false;
        }
        return true;
    }
}
