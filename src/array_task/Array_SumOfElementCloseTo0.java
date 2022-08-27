package array_task;

import java.util.Arrays;
import java.util.Random;

public class Array_SumOfElementCloseTo0 {
    public static void main(String[] args) {

        int[] nums = {new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100)
                , -new Random().nextInt(100), -new Random().nextInt(100)};

        System.out.println(Arrays.toString(nums));
        System.out.println(sumOfElementCloseTo0(nums));

    }
    private static int sumOfElementCloseTo0(int[] array) {

        int sum = array[0] + array[1];

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (Math.abs(array[i] + array[j]) < Math.abs(sum)){
                    sum = array[i] + array[j];
                }
            }
        }
        return sum;
    }
}
