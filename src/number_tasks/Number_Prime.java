package number_tasks;

public class Number_Prime {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(solution(1078969597));
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);
    }
    private static boolean isPrime(long num){

        if (num == 2) {
            return true;
        }

        if (num < 2 || num % 2 == 0) {
            return false;
        }

        for (int i = 3; num >= (long) i * i; i+=2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
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
