package array_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_LargestRectangularArea {
    public static void main(String[] args) {

        System.out.println(largestRectangularArea(new int[]{6, 2, 5, 4, 5, 1, 6}));

    }

    private static int largestRectangularArea(int[] array) {

        int max = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 1;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[i]){
                    break;
                }
                count++;
            }

            for (int k = i - 1; k >= 0; k--) {

                if (array[k] < array[i]){
                    break;
                }
                count++;
            }
            max = Math.max(max, array[i] * count);
        }
        return max;
    }
}
