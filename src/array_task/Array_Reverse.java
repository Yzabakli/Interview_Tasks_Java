package array_task;

import java.util.Arrays;

public class Array_Reverse {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverse(new Integer[]{1, 2, 3, 4, 5, 6})));

    }

    private static Object[] reverse(Object[] array) {

        Object[] objects = new Object[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            objects[j] = array[i];
        }
        return objects;
    }
}
