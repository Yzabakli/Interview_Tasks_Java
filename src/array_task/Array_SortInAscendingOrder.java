package array_task;

import java.util.Arrays;

public class Array_SortInAscendingOrder {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortInAscendingOrder(new int[]{5, 5, 5, 5, 5, 4, 3, 2, 1, 5})));

    }

    private static int[] sortInAscendingOrder(int[] array) {

        int[] numbers = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int j = 0, m = 0, n = 0;
            numbers[i] = Integer.MAX_VALUE;
            for (int number : array) {
                if (number < numbers[i]) {
                    j++;
                    numbers[i] = number;
                } else n++;
                m++;
            }
            array[array.length - (m - j)] = Integer.MAX_VALUE;
        }
        return numbers;
    }

    public static int[] sortingArrayAsc(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }

        }

        return result;

    }
}
