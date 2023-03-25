package home_works.home_work6.task2;

import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> result = new TreeSet<>();
        for (int number : nums) {
           if (!result.add(number)){
               return true;
           }
        }
        return false;
    }
}
