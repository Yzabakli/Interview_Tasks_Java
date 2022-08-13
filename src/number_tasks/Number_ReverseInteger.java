package number_tasks;

public class Number_ReverseInteger {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(reverse(12345678910111213L));
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
