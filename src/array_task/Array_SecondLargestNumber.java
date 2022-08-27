package array_task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Array_SecondLargestNumber {
    public static void main(String[] args) {

        int[] nums = new int[1000000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
        }

        System.out.println(secondLargestNumber3(nums));
    }

    private static int secondLargestNumber(int[] array) {

        int max1 = array[0], max2 = array[0];

        for (int num : array) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return max2;
    }

    private static int secondLargestNumber2(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        return Arrays.stream(array).filter(value -> value != max).max().getAsInt();
    }

    private static int secondLargestNumber3(int[] array) {
        array = Arrays.stream(array).sorted().toArray();
        if (array[array.length - 1] != array[array.length - 2]){
            return array[array.length - 2];
        }
        int max = array[array.length - 1];

        for (int i = array.length - 3; i >= 0; i--) {

            if (array[i] != max){
                return array[i];
            }
        }
        return max;
    }
}
