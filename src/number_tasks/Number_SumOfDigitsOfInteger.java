package number_tasks;

public class Number_SumOfDigitsOfInteger {
    public static void main(String[] args) {

        System.out.println(sumOfDigitsOfInteger2(46946446654L));

    }

    private static long sumOfDigitsOfInteger(long n) {

        long sum = 0;

        while (n > 0) {

            sum += n % 10;

            n /= 10;
        }

        return sum;
    }

    private static long sumOfDigitsOfInteger2(long n) {

        return String.valueOf(n).chars().map(Character::getNumericValue).sum();
    }
}
