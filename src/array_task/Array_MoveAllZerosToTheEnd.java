package array_task;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(moveAllZerosToTheEnd2(new int[]{5, 0, 4, 0, 2, 7, 0, 0, 2, 9, 8, 5, 2})));
        System.out.println(Arrays.toString(moveAllZerosToTheEnd2(new int[]{1, 0, 2, 0, 0, 7})));

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

    private static int[] moveAllZerosToTheEnd2(int[] arr) {

        int i = 0, j = 1;

        while (j < arr.length){
            if (arr[i] == 0 && arr[j] != 0){

                arr[i] = arr[j];
                arr[j] = 0;
                j++;
                i++;
            }else {
                j++;
                if (arr[i] != 0){
                    i++;
                }
            }
        }

        return arr;
    }
}
