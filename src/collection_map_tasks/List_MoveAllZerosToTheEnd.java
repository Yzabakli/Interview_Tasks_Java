package collection_map_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List_MoveAllZerosToTheEnd {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            list.addAll(Arrays.asList(5, 0, 4, 0, 2, 7, 0, 0, 2, 9, 8, 5, 2));
        }

        long start = System.currentTimeMillis();

        solution(list);

        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);

    }

    private static List<Integer> moveAllZerosToTheEnd(List<Integer> list){

        int[] temp = new int[list.size()];

        int i = 0;

        for (Integer number : list) {

            if (number != 0){
                temp[i++] = number;
            }
        }

        list = new ArrayList<>();

        for (int number : temp) {

            list.add(number);
        }
        return list;
    }

    private static List<Integer> moveAllZerosToTheEnd2(List<Integer> list) {

        int originalSize = list.size();

        list.removeAll(Collections.singleton(0));

        for (int i = 0; i < originalSize - list.size(); i++) {

            list.add(0);
        }
        return list;
    }

    private static List<Integer> solution(List<Integer> list) {

        int originalSize = list.size();

        list.removeAll(Collections.singleton(0));

        int totalNumberOfZeros = originalSize - list.size();

        for (int i = 0; i < totalNumberOfZeros; i++) {

            list.add(0);
        }
        return list;
    }
}
