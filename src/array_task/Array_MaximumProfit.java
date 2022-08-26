package array_task;

import java.util.Arrays;

public class Array_MaximumProfit {
    public static void main(String[] args) {

        int[] array = {11, 3, 13, 3, 1, 4, 9, 12, 11};
        int[] array2 = {8, 3, 3, 1, 4, 9, 12, 11};

        System.out.println(maximumProfit(array));
        System.out.println(solution(array));
    }

    private static int maximumProfit(int[] array) {

        int profit = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                profit = Integer.max(profit, array[j] - array[i]);
            }
        }
        return profit;
    }

    private static int solution(int[] arr) {

        int min = arr[0];
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            int profit = 0;
            if (j > min) {
                profit = j - min;
                if (profit > max) {
                    max = profit;
                }
            } else {
                min = j;
            }
        }
        System.out.println(Arrays.toString(arr));
        return max;
    }
}
