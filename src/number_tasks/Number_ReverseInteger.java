package number_tasks;

import java.util.Arrays;
import java.util.Comparator;

public class Number_ReverseInteger {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(reverse(153423646));
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
    private static long reverse(int x){
        if(x < 10 && x >= 0){
            return x;
        }

        int result = 0;
        long check = 0;

        while (x !=0) {
            result = result * 10 + x % 10;
            check = check * 10 + x % 10;
            x /= 10;

            if (check != result){
                return 0;
            }
        }

        return result;
    }
}
