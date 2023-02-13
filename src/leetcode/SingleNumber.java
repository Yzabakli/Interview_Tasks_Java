package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SingleNumber {
    public static void main(String[] args) {

        System.out.println(singleNumber3(new int[]{4,1,2,1,2, 4, 3}));
    }

    private static int singleNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        List<Integer> list = Arrays.stream(nums).boxed().toList();

        return list.stream().distinct().filter(i -> Collections.frequency(list, i) == 1).findFirst().orElseThrow();

    }

    private static int singleNumber3(int[] nums) {

        int result = 0;
        for(int i : nums){
            result ^= i;
        }
        return result;

    }

    private static int singleNumber2(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        List<Integer> list = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        List<Integer> list1;

        for (int i = 0; i < nums.length; i++) {
            list1 = new ArrayList<>(list);
            list1.remove(i);
            if (!list1.contains(nums[i])) {

                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}
