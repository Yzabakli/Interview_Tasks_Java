package array_task;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Array_AddUpToSum {
    public static void main(String[] args) {


    }

    private static void addUpToSum(int[] arr, int sum) {

        int temp = 0;

        Map<Integer , Integer> integerMap = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] + arr[j] == sum){

                    integerMap.put(arr[i] , arr[j]);

                }
            }
        }

        System.out.println(Arrays.toString(arr) + "\n" + sum + "\n" + integerMap);
    }
}
