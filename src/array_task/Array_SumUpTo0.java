package array_task;

import java.util.Arrays;
import java.util.Random;

public class Array_SumUpTo0 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sumUpTo0_2(10)));
    }

    private static int[] sumUpTo0(int n){

        int[] numbers = new int[n];
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {

            numbers[i] = new Random().nextInt((200) + 1) - 100;
            sum += numbers[i];
        }
        numbers[n - 1] = -sum;
        return numbers;
    }

    private static int[] sumUpTo0_2(int n){

        int[] numbers = new int[n];
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {

            numbers[i] = i;
            sum += numbers[i];
        }
        numbers[n - 1] = -sum;
        return numbers;
    }
}
