package array_task;

public class Array_SumOfElementCloseTo0 {
    public static void main(String[] args) {

        //int[] nums = {oneRandomNumberGenerator(5, -5), oneRandomNumberGenerator(5, -5), oneRandomNumberGenerator(5, -5), oneRandomNumberGenerator(5, -5), oneRandomNumberGenerator(5, -5)};

        //System.out.println(Arrays.toString(nums));
        //System.out.println(sumOfElementCloseTo0(nums));

    }

    private static int sumOfElementCloseTo0(int[] array) {

        int num1 = Integer.MAX_VALUE, num2 = Integer.MAX_VALUE, num3 = Integer.MIN_VALUE, num4 = Integer.MIN_VALUE;

        for (int num : array) {

            if (num > 0) {

                num1 = Integer.min(num1, num);

            } else if (num < 0) {

                num3 = Integer.max(num3, num);
            }
        }

        for (int num : array) {

            if (num > 0 && num != num1) {

                num2 = Integer.min(num2, num);

            } else if (num < 0 && num != num3) {

                num4 = Integer.max(num4, num);

            }
        }

        if (num2 <= num3 * -1) {

            System.out.println(num1 + "  " + num2);
            return Integer.sum(num1, num2);

        } else if (num4 * -1 < num1) {

            System.out.println(num3 + "  " + num4);
            return Integer.sum(num3, num4);

        } else {

            System.out.println(num1 + "  " + num3);
            return Integer.sum(num1, num3);
        }
    }
}
