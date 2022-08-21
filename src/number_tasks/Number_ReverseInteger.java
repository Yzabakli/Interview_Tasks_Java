package number_tasks;

import java.util.Arrays;
import java.util.Comparator;

public class Number_ReverseInteger {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(reverseInteger2(12345678910111213L));
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);
    }
    private static long reverseInteger(long num){

        String numS = String.valueOf(num);

        String result = "";

        for (int i = numS.length() - 1; i >= 0; i--) {

            result += numS.charAt(i);
        }
        return Long.parseLong(result);
    }
    private static long reverseInteger2(long num){

        return Long.parseLong(Arrays.toString(String.valueOf(num).chars().map(Character::getNumericValue).asLongStream().boxed()
                .sorted(Comparator.reverseOrder()).toArray()).replace("[", "").replace(", ", "").replace("]", ""));
    }
    private static long reverse(long number){
        if(number < 10 && number >= 0){
            return number;
        }

        long result = 0;
        while (number !=0) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        return result;
    }
}
