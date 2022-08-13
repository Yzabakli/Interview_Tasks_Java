package array_task;

import java.util.Arrays;

public class Array_MaximumProfit {
    public static void main(String[] args) {

        int[] array = {11, 3, 13, 3, 1, 4, 9, 12, 11};

        long start = System.currentTimeMillis();

        System.out.println(maximumProfit(array));
        System.out.println(maximumProfit2(array));

        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);
    }

    private static int maximumProfit(int[] array) {

        int max = array[1], maxIndex = 0, min = array[array.length - 2], minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i > 1 && array[i] >= max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min && i < array.length - 2) {

                min = array[i];
                minIndex = i;
            }
        }

        System.out.println(Arrays.toString(array));

        if (minIndex < maxIndex) {

            return max - min;

        } else {

            int tempMin = Integer.MAX_VALUE;
            int tempMax = Integer.MIN_VALUE;

            for (int i = 0, j = minIndex + 1; true; i++, j++) {

                if (i < maxIndex || j < array.length) {

                    if (i < maxIndex && array[i] < tempMin) {

                        tempMin = array[i];

                    }
                    if (j < array.length && array[j] > tempMax) {

                        tempMax = array[j];
                    }

                } else break;
            }
            return Integer.max((max - tempMin), (tempMax - min));
        }
    }

    private static int maximumProfit2(int[] arr) {

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
