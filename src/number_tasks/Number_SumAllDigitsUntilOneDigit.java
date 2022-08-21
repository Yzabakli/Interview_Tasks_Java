package number_tasks;

public class Number_SumAllDigitsUntilOneDigit {
    public static void main(String[] args) {

        sumAllDigitsUntilOneDigit(9999999999999999L);

    }
    private static void sumAllDigitsUntilOneDigit(long num){

        while (num > 9) {

            long digit = num, sum = 0;

            while (digit > 0) {

                sum += digit % 10;

                digit /= 10;
            }

            System.out.println(sum);

            num = sum;
        }
    }

    private static void sumAllDigitsUntilOneDigit2(long num){

        if (num < 10){
            return;
        }
        long temp = String.valueOf(num).chars().map(Character::getNumericValue).sum();

        System.out.println(temp);

        sumAllDigitsUntilOneDigit2(temp);
    }
}
