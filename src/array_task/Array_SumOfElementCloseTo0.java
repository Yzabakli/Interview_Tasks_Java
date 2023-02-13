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
    private static int sumOfElementCloseTo0(int[] nums) {

        int sum = nums[0] + nums[1];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (Math.abs(nums[i] + nums[j]) < Math.abs(sum)){
                    sum = nums[i] + nums[j];
                }
            }
        }
        return sum;
    }
}
