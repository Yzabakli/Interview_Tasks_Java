package number_tasks;

public class Number_HappyAndUnhappyNumber {
    public static void main(String[] args) {

        solution2(7839);

    }

    private static void happyAndUnhappyNumber(int num) {

        int a = 0, b = 0, c = 0, result = num, i = 0;

        for (i = 0; i < 100; i++) {

            if (result == 1) {

                break;
            }
            if (i > 1 && (result == num || result == 37 || result == 20)) {

                if (result != 37 && result != 20) {

                    System.out.println("it reaches again to " + num + " and it took " + i + " round");
                } else System.out.println("it reaches to 37 or 20 it means it entered in infinite loop");

                System.exit(1);
            }
            if (result > 99) {

                a = result / 100;
                b = result % 100 / 10;
                c = result % 100 % 10;

                result = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));

                System.out.println(a + "² + " + b + "² + " + c + "² = " + result);

            } else if (result > 9) {

                a = result / 10;
                b = result % 10;

                result = (int) (Math.pow(a, 2) + Math.pow(b, 2));

                System.out.println(a + "² + " + b + "² = " + result);

            } else {

                int temp = result;

                result = (int) Math.pow(result, 2);

                System.out.println(temp + "² = " + result);
            }
        }

        if (result == 1) {

            System.out.println(num + " is happy number and it reaches 1 in " + i + " round");

        } else System.out.println(num + " is unhappy number");
    }

    private static void solution(int n) {

        while (n != 1 && n != 4) {
            int r = 0, sum = 0;

            while (n > 0) {
                r = n % 10;
                sum = sum + (r * r);
                n = n / 10;
            }

            n = sum;
        }

        if (n == 1) {
            System.out.println("Happy number");
        } else {
            System.out.println("Unhappy number");
        }
    }

    private static void solution2(int num) {

        int result = num;


        while (result != 1 && result != 4) {

            int a = 0, b = 0;

            for (int i = 0; i < String.valueOf(result).length(); i++) {

                if (i != String.valueOf(result).length()-1){

                    System.out.print(String.valueOf(result).charAt(i) + "² + ");
                }else System.out.print(String.valueOf(result).charAt(i) + "²");
            }

            while (result > 0) {

                a = result % 10;
                b = b + (a * a);
                result = result / 10;

            }
            System.out.println(" = " + b);

            result = b;
        }
        if (result == 1){

            System.out.println(num + " is happy number");
        }else {
            System.out.println(num + " is unhappy number");
        }
    }
}
