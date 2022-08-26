package array_task;

public class Array_LargestSumContiguousSubarray {
    public static void main(String[] args) {

        System.out.println(largestSumContiguousSubarray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

    }

    private static int largestSumContiguousSubarray(int[] array) {

        int max2 = 0;

        for (int i = 0; i < array.length; i++) {
            int max = array[i];

            for (int j = i + 1; j < array.length; j++) {

                max += array[j];
                max2 = Math.max(max, max2);
            }
        }
        return max2;
    }

    private static int solution(int[] array) {

        int sum = 0, sum2 = Integer.MIN_VALUE;

        for (int number : array) {

            sum += number;
            sum2 = Integer.max(sum, sum2);
            sum = Integer.max(sum, 0);

        }


        return sum2;
    }
}
