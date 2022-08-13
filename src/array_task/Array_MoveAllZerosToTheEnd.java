package array_task;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(moveAllZerosToTheEnd(new int[]{5, 0, 4, 0, 2, 7, 0, 0, 2, 9, 8, 5, 2})));

    }

    private static int[] moveAllZerosToTheEnd(int[] arr) {

        int[] array = new int[arr.length];
        int i = 0;

        for (int num : arr) {
            if (num != 0) {
                array[i++] = num;
            }
        }
        return array;
    }
}
