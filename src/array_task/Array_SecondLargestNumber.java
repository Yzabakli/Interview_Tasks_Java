package array_task;

import java.util.Arrays;

public class Array_SecondLargestNumber {
    public static void main(String[] args) {
/*
        int[] nums = new int[1000000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
        }

 */

        long start = System.currentTimeMillis();
        System.out.println(secondLargestNumber3(new int[]{4, 4, 3}));
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);

    }

    private static int secondLargestNumber(int[] array) {

        int max1 = array[0], max2 = Integer.MIN_VALUE;

        for (int number : array) {

            max1 = Integer.max(max1, number);
        }

        for (int number : array) {

            if (number != max1) {
                max2 = Integer.max(max2, number);
            }
        }
        return max2;
    }

    private static int secondLargestNumber2(int[] arr) {
        return Arrays.stream(arr).filter(p -> p != Arrays.stream(arr).max().getAsInt()).max().getAsInt();
    }

    private static int secondLargestNumber3(int[] arr) {
        int max1 = arr[0];
        int max2 = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        return max2;

    }
}
