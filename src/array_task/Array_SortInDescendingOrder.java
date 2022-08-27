package array_task;

import java.util.Arrays;

public class Array_SortInDescendingOrder {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortInDescendingOrder(new int[]{5, 5, 5, 5, 5, 4, 3, 2, 1, 5})));
    }
    private static int[] sortInDescendingOrder(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[j] > array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
