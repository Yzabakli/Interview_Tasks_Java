package number_tasks;

public class Number_SumOfDigitsOfInteger {
    public static void main(String[] args) {

        System.out.println(sumOfDigitsOfInteger(1234));

    }

    private static int sumOfDigitsOfInteger(int n) {

        int sum = 0;

        while (n > 0) {

            sum += n % 10;

            n /= 10;
        }

        return sum;
    }
}
