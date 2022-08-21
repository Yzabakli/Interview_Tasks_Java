package number_tasks;

public class Number_HappyAndUnhappyNumber {
    public static void main(String[] args) {

        happyAndUnhappyNumber(7839);

    }

    private static void happyAndUnhappyNumber(int num) {

        int result = num, i = 0;

        while (result != 1) {

            i++;

            if (i > 1 && (result == num || result == 37 || result == 20)) {

                if (result != 37 && result != 20) {

                    System.out.println("it reaches again to " + num + " and it took " + i + " round");
                } else System.out.println("it reaches to 37 or 20 it means it entered in infinite loop");

                System.exit(1);
            }
            int temp = 0;

            String[] array = String.valueOf(result).split("");

            for (int j = 0; j < array.length; j++) {

                temp += Math.pow(Integer.parseInt(array[j]), 2);

                if (j != array.length - 1){

                    System.out.print(array[j] + "² + ");
                }else System.out.print(array[j] + "² = ");
            }
            result = temp;

            System.out.print(result + "\n");
        }

        System.out.println(num + " is happy number and it reaches 1 in " + i + " steps");

    }

    private static void happyAndUnhappyNumber2(int num) {

        int result = num, i = 0;

        while (result != 1) {

            i++;

            if (i > 1 && (result == num || result == 37 || result == 20)) {

                System.out.println("Unhappy number");

                System.exit(1);
            }
            int temp = 0;

            String[] array = String.valueOf(result).split("");

            for (String str : array) {

                temp += Math.pow(Integer.parseInt(str), 2);
            }
            result = temp;
        }

        System.out.println("Happy number");

    }

    private static void happyAndUnhappyNumber3(int num) {

        int result = num;
        int i = 0;

        while (result != 1) {

            i++;

            if (i > 1 && (result == num || result == 37 || result == 20)) {

                System.out.println("Unhappy number");

                System.exit(1);
            }
            result = String.valueOf(result).chars().map(Character::getNumericValue).map(j -> j*j).sum();
        }

        System.out.println("Happy number");

    }

    private static void solution(int n) {

        while (n != 1 && n != 4) {
            int r, sum = 0;

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

    private static void happyAndUnhappyNumber4(int num) {

        int result = num;


        while (result != 1 && result != 4) {

            int a, b = 0;

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
