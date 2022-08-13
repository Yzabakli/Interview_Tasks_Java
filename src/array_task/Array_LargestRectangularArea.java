package array_task;

public class Array_LargestRectangularArea {
    public static void main(String[] args) {

        System.out.println(largestRectangularArea(new int[]{6, 2, 5, 4, 5, 1, 6}));

    }

    private static int largestRectangularArea(int[] array) {

        int max = Integer.MIN_VALUE;

        for (int num : array) {
            if (num == max) {
                continue;
            }
            if (num > max) {
                max = num;
            }
        }

        return max * 2;
    }
}
