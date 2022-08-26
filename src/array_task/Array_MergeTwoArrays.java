package array_task;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array_MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = new int[10000000];
        int[] arr2 = new int[10000000];

        int i = 0;
        int k = arr2.length;

        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = i++;
            arr2[j] = k--;
        }

        System.out.println(Arrays.toString(mergeTwoArrays2(arr1, arr2)));

    }

    private static int[] mergeTwoArrays(int[] arr1, int[] arr2) {

        int[] mergedArray = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length + arr2.length; i++) {

            if (i < arr1.length) {

                mergedArray[i] = arr1[i];

            } else {

                mergedArray[i] = arr2[i - arr1.length];
            }
        }
        return mergedArray;
    }
    private static int[] mergeTwoArrays2(int[] arr1, int[] arr2) {

        return IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).toArray();
    }

    public static int[] solution(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }
}
