package array_task;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Array_RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(removeDuplicates2(new int[]{1, 1, 2, 2, 3, 3, 4})));

    }

    private static int[] removeDuplicates(int[] array) {


        int count = getCount(array);

        int[] result = new int[array.length - count];

        int k = 0;

        for (int i = 0; i < array.length; i++) {
            int occurrence = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    occurrence++;
                }
            }
            if (occurrence == 1) {
                result[k++] = array[i];
            }
        }
        return result;
    }

    private static int getCount(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            int occurrence = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    occurrence++;
                }
            }
            if (occurrence > 1) {
                count++;
            }
        }
        return count;
    }

    private static int[] removeDuplicates2(int[] array) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : array) {
            set.add(num);
        }
        array = new int[set.size()];

        int a = 0;
        for (Integer i : set) {
            array[a++] = i;
        }

        return array;
    }
}
