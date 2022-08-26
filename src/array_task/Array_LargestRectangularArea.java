package array_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_LargestRectangularArea {
    public static void main(String[] args) {

        System.out.println(largestRectangularArea(new int[]{6, 2, 5, 4, 5, 1, 6}));

    }

    private static int largestRectangularArea(int[] array) {
        
        int count;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            count = 1;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[i]){
                    break;
                }
                count++;
            }

            for (int length = i - 1; length >= 0; length--) {

                if (array[length] < array[i]){
                    break;
                }
                count++;
            }
            list.add(array[i] * count);
        }
        return Collections.max(list);
    }
}
