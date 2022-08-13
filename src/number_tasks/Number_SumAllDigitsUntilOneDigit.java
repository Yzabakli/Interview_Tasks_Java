package number_tasks;

public class Number_SumAllDigitsUntilOneDigit {
    public static void main(String[] args) {

        sumAllDigitsUntilOneDigit(797897);

    }
    private static void sumAllDigitsUntilOneDigit(int num){

        while (num > 9) {

            int digit = num, sum = 0;

            while (digit > 0) {

                sum += digit % 10;

                digit /= 10;
            }

            System.out.println(sum);

            num = sum;
        }
    }
}
