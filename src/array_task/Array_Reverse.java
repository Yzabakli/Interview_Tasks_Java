package array_task;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collector;

public class Array_Reverse {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverse(new Object[]{new int[3], 1, "gjdlkfg", 3, 4, 5, 6})));

    }

    private static Object[] reverse(Object[] array) {

        Object[] objects = new Object[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            objects[j] = array[i];
        }
        return objects;
    }

    private static Object[] reverse2(Object[] array) {

        return Arrays.stream(array)
                .collect(Collector.of(
                        ArrayDeque::new,
                        ArrayDeque::addFirst,
                        (d1, d2) -> { d2.addAll(d1); return d2; }))
                .toArray();
    }
}
