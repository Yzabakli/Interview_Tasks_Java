package array_task;

import java.util.Arrays;

public class Array_SumOfLeftEqualToRight {
    public static void main(String[] args) {

        sumOfLeftEqualToRight(new int[]{4, 9, 1, 3, 6, 4});
    }

    private static void sumOfLeftEqualToRight(int[] array){

        for (int i = 0; i < array.length; i++) {

            int sum1 = 0, sum2 = 0;

            for (int j = 0; j < array.length; j++) {

                if (j < i){
                    sum1 += array[j];
                } else if (j > i) {
                    sum2 += array[j];
                }
            }
            if (sum1 == sum2){
                System.out.println(array[i] + " in index " + i);
            }
        }
    }
}
