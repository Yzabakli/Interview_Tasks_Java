package array_task;

import java.util.Arrays;

public class Array_SortInAscendingOrder {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortInAscendingOrder(new int[]{5, 5, 5, 5, 5, 4, 3, 2, 1, 5})));
    }

    private static int[] sortInAscendingOrder(int[] array) {

        int[] numbers = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            int index = 0;
            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[i]){

                    numbers[i] = array[j];
                    numbers[j] = array[i];
                    index = j;
                }
            }
            array[i] = numbers[i];
            array[index] = numbers[index];
        }
        return numbers;
    }

    private static int[] sortInAscendingOrder2(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
