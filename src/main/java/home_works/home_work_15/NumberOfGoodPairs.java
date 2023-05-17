package home_works.home_work_15;

public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
           for (int k = i + 1; k < nums.length; k++){
               if (nums[i] == nums[k]) result++;
           }
        }
        return result;
    }
}
