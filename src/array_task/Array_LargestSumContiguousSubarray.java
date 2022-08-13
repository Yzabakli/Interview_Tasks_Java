package array_task;

public class Array_LargestSumContiguousSubarray {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        System.out.println(largestSumContiguousSubarray2(new int[]{-2, -1, -3, -4, -1, -2, -1, -5, -4}));

        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);

    }

    private static int largestSumContiguousSubarray(int[] array) {

        int max = 0, temp = 0, temp2 = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > temp2) {
                temp2 = num;
            }
        }

        if (temp2 <= 0) {

            return temp2;

        }

        for (int each : array) {
            temp = temp + each;
            temp = Integer.max(temp, 0);
            max = Integer.max(max, temp);
        }

        return max;
    }

    private static int largestSumContiguousSubarray2(int[] array) {

        int sum = 0, sum2 = Integer.MIN_VALUE;

        for (int number : array) {

            sum += number;
            sum2 = Integer.max(sum, sum2);
            sum = Integer.max(sum, 0);

        }


        return sum2;
    }
}
