package number_tasks;

public class Number_SumAllDigitsUntilOneDigit {
    public static void main(String[] args) {

//        sumAllDigitsUntilOneDigit(9999999999999999L);
//        System.out.println(sumAllDigitsUntilOneDigit2(942));
        long start = System.currentTimeMillis();
        System.out.println(sumAllDigitsUntilOneDigit2(99999999999L));
        System.out.println("elapsedTime = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println(sumAllDigitsUntilOneDigit3WithPrint(99999999999L));
        System.out.println("elapsedTime = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println(sumAllDigitsUntilOneDigit2WithPrint(99999999999L));
        System.out.println("elapsedTime = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println(sumAllDigitsUntilOneDigit3(99999999999L));
        System.out.println("elapsedTime = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println(war(99999999999L));
        System.out.println("elapsedTime = " + (System.currentTimeMillis() - start));

    }

    private static void sumAllDigitsUntilOneDigit(long n) {

        while (n > 9) {

            long digit = n, sum = 0;

            while (digit > 0) {

                sum += digit % 10;

                digit /= 10;
            }

            System.out.println(sum);

            n = sum;
        }
    }

    private static long sumAllDigitsUntilOneDigit2WithPrint(long num) {

        if (num > 9) {

            printer(num);

            return sumAllDigitsUntilOneDigit2WithPrint(String.valueOf(num)
                    .chars()
                    .map(Character::getNumericValue)
                    .sum());
        }
        return num;
    }

    private static long sumAllDigitsUntilOneDigit2(long num) {

        return (num < 10) ? num : sumAllDigitsUntilOneDigit2(String.valueOf(num).chars().map(Character::getNumericValue).sum());
    }

    private static long sumAllDigitsUntilOneDigit3WithPrint(long num) {

        if (num > 9) {

            printer(num);

            long digit = num, sum = 0;

            while (digit > 0) {

                sum += digit % 10;

                digit /= 10;
            }

            return sumAllDigitsUntilOneDigit3WithPrint(sum);

        } else return num;
    }

    private static long sumAllDigitsUntilOneDigit3(long num) {


        if (num > 9) {

            long sum = 0;

            while (num > 0) {

                sum += num % 10;

                num /= 10;
            }
            return sumAllDigitsUntilOneDigit3(sum);

        } else return num;
    }


    private static void printer(long num) {
        System.out.print(num + " --> ");

        int[] array = String.valueOf(num).chars().map(Character::getNumericValue).toArray();
        for (int i = 0; i < array.length - 1; i++) {

            System.out.print(array[i] + " + ");
        }
        System.out.print(array[array.length - 1] + " = ");
    }

    private static long war(long num) {

        return --num % 9 + 1;
    }
}
