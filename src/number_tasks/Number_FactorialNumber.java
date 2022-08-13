package number_tasks;

public class Number_FactorialNumber {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println();
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);

    }
    private static long factorialNumber(int number){

        long factor = 1;

        for (int i = number; i >= 2; i--) {

            factor *= i;
        }
        return factor;
    }
    private static int factorialNumber2(int number){

        if (number == 0){
            return 1;
        }
        return number * factorialNumber2(number - 1);
    }
}
