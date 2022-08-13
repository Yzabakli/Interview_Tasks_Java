package collection_map_tasks;

import java.util.ArrayList;
import java.util.List;

public class List_RemoveNumbers {
    public static void main(String[] args) {

        List<Integer> stack = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {

            stack.add(i+1);
        }

        long start = System.currentTimeMillis();
        removeNumbers(stack);
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);

    }

    private static List<Integer> removeNumbers(List<Integer> list){

        list.removeIf(p -> p > 100);

        return list;
    }
}
