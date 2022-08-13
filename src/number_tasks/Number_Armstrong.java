package number_tasks;

public class Number_Armstrong {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(isArmstrong(1741725));
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);


    }
    private static boolean isArmstrong(int number){

        String numberToString = String.valueOf(number);

        int power = numberToString.length();

        int sum = 0;

        for (int i = 0; i < power; i++) {

            sum += Math.pow(Integer.parseInt(numberToString.substring(i,i+1)) , power);
        }

        return sum == number;
    }
    private static boolean isArmStrongNumber(int num) {
        int a, b = 0, c = num;

        while (num > 0) {
            a = num % 10;
            num /= 10;
            b = b + (a * a * a);
        }

        return c == b;
    }
}
