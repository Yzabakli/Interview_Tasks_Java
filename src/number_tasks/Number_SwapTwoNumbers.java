package number_tasks;

import java.util.Arrays;

public class Number_SwapTwoNumbers {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(swapTwoNumbers2(75, 50)));

    }
    private static int[] swapTwoNumbers(int num1, int num2){

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        return new int[]{num1, num2};
    }

    private static int[] swapTwoNumbers2(int num1, int num2){

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        return new int[]{num1, num2};
    }
}
