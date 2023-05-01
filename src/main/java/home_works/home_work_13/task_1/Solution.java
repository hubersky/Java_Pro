package home_works.home_work_13.task_1;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice = 0;
        int profit = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            if (prices[i] > maxPrice) maxPrice = prices[i];
            if (maxPrice - prices[i] > profit) profit = maxPrice - prices[i];
        }
        return profit;
    }
}
