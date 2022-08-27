package array_task;

import java.util.*;
import java.util.stream.IntStream;

public class Array_RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(removeDuplicates3_4(new int[]{1, 1, 2, 2, 3, 3, 4})));
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

    private static int[] removeDuplicates2(int[] array){

        return Arrays.stream(array).distinct().toArray();
    }

    private static int[] removeDuplicates3(int[] array){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : array) {

            if (!list.contains(i)){

                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int[] removeDuplicates3_2(int[] array){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : array) {

            if (!list.contains(i)){

                list.add(i);
            }
        }
        array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    private static int[] removeDuplicates3_3(int[] array){

        Set<Integer> set = new LinkedHashSet<>();

        for (int i : array) {

            set.add(i);
        }
        array = new int[set.size()];
        int i = 0;
        for (Integer integer : set) {

            array[i++] = integer;
        }
        return array;
    }

    private static int[] removeDuplicates3_4(int[] array){

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i : array) {

            if (!deque.contains(i)){

                deque.push(i);
            }
        }
        array = new int[deque.size()];
        int i = 0;
        for (Integer integer : deque) {

            array[i++] = integer;
        }
        return array;
    }

    private static int[] removeDuplicates3_4_2(int[] array){

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i : array) {

            if (!deque.contains(i)){

                deque.push(i);
            }
        }
        array = new int[deque.size()];
        int i = 0;
        while (!deque.isEmpty()){
            array[i++] = deque.pop();
        }
        return array;
    }
}
