package array_task;

public class Array_MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = new int[100000000];
        int[] arr2 = new int[100000000];

        int i = 0;
        int k = arr2.length;

        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = i++;
            arr2[j] = k--;
        }
        long start = System.currentTimeMillis();

        mergeTwoArrays(arr1, arr2);

        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);

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

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

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
