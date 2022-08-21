package number_tasks;

public class Number_Prime {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(isPrime(100055128505716009L));
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);
    }
    private static boolean isPrime(long num){

        if (num < 2) {
            return false;
        }

        boolean prime = num == 2 || num == 3 || num == 5 || num == 7;

        boolean prime2 = num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0;

        if (prime){

            return true;

        }else return prime2;
    }
    private static boolean solution(long num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }
}
