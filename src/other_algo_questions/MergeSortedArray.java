package other_algo_questions;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

//        int size = 99999999;
//        int[] damnThatIsABigOne = new int[size];
//        int[] damnThatIsABigOne2 = new int[size - 1000];
//
//        Random random = new Random();
//
//        Arrays.setAll(damnThatIsABigOne, i -> random.nextInt());
//        Arrays.setAll(damnThatIsABigOne2, i -> random.nextInt());
//
//        var start = System.currentTimeMillis();
//        mergeSortedArray_2(damnThatIsABigOne, size - damnThatIsABigOne2.length, damnThatIsABigOne2, damnThatIsABigOne2.length);
//        System.out.println(System.currentTimeMillis() - start);

        int[] array1 = {1, 2, 8, 0, 0, 0};
        mergeSortedArray(array1, 3, new int[]{3, 3, 3}, 3);
        System.out.println(Arrays.toString(array1));
//        System.out.println(mergeSortedArray_2(new int[]{3, 3, 3, 0, 0, 0}, 3, new int[]{1, 2, 2}, 3));
//        System.out.println(mergeSortedArray(new int[]{1}, 1, new int[]{}, 0));
//        System.out.println(Arrays.toString(mergeSortedArray(new int[]{0}, 0, new int[]{1}, 1)));
    }

    private static void mergeSortedArray(int[] array1, int m, int[] array2, int n) {

        if (m == 0) {
            array1 = array2;
            return;
        }
        if (array2.length == 0) return;

        for (int i = 0; i < array2.length; i++) {

            array1[m + i] = array2[i];
        }

        if (array1[m - 1] <= array1[m]) return;

        for (int i = 0; i < array1.length - 1; i++) {

            if (array1[i] > array1[i + 1]) {

                array1[i] = array1[i] + array1[i + 1];
                array1[i + 1] = array1[i] - array1[i + 1];
                array1[i] -= array1[i + 1];

                i--;
            }
        }
    }

    private static void mergeSortedArray_2(int[] array1, int m, int[] array2, int n) {

        if (n == 0) return;
        if (m == 0) {
            array1 = array2;
            return;
        }

        System.arraycopy(array2, 0, array1, m, n);

        if (array1[m - 1] <= array1[m]) return;

        Arrays.sort(array1);
    }

    private static int[] mergeSortedArray_3(int[] array1, int m, int[] array2, int n) {

        if (n == 0) return array1;
        if (m == 0) return array1 = array2;

        System.arraycopy(array2, 0, array1, m, n);

        if (array1[m - 1] <= array1[m]) return array1;

        return Arrays.stream(array1).parallel().sorted().filter(integer -> integer != 0).toArray();
    }
}
