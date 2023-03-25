package home_works.home_work6.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {3, 4, 9, 4, 7, 6, 2, 4, 10};
        int target = 5;
        System.out.println(Arrays.toString(solution.twoSum(numbers,target)));
    }
}
