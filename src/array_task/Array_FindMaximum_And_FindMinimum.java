package array_task;

public class Array_FindMaximum_And_FindMinimum {
    public static void main(String[] args) {

        int[] ints = new int[100000000];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i+1;
        }

        long start = System.currentTimeMillis();

        System.out.println(findMinimum(ints));

        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);

    }

    private static int findMaximum(int[] array){

        int max = Integer.MIN_VALUE;

        for (int each : array) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

    private static int findMinimum(int[] array){

        int min = Integer.MAX_VALUE;

        for (int each : array) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }
}
