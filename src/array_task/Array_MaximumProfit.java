package array_task;

import java.util.Arrays;
import java.util.Random;

public class Array_MaximumProfit {
    public static void main(String[] args) {

//        int[] array = {11, 3, 13, 3, 1, 4, 9, 12, 11};
//        int[] array2 = {8, 3, 3, 1, 4, 9, 12, 11};
//        int[] array3 = {7, 6, 4, 3, 1};

//        System.out.println(maximumProfit(array));
//        System.out.println(solution(array3));

        System.out.println(new Random().nextInt(5) + 1);
    }

    private static int maximumProfit(int[] prices) {

        int profit = 0;

        for (int i = 0; i < prices.length; i++) {

            for (int j = i + 1; j < prices.length; j++) {

                profit = Integer.max(profit, prices[j] - prices[i]);
            }
        }
        return profit;
    }

    private static int solution(int[] prices) {

        int min = prices[0];
        int max = Integer.MIN_VALUE;
        for (int j : prices) {
            int profit;
            if (j > min) {
                profit = j - min;
                if (profit > max) {
                    max = profit;
                }
            } else {
                min = j;
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }


    static int maxProfit(int[] prices) {
        // Initialize the minimum price to buy...
        int minBuy = prices[0];
        // Initialize the maximum profit...
        int profit = 0;
        // Traverse all elements through a for loop...
        for (int i = 1; i < prices.length; i++) {
            // Get the minimum price to buy...
            minBuy = Math.min(minBuy, prices[i]);
            // Get maximum profit...
            profit = Math.max(profit, prices[i] - minBuy);
        }
        return profit;      //return the maximum profit...
    }
}
