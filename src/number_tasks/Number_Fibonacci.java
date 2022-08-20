package number_tasks;

public class Number_Fibonacci {
    public static void main(String[] args) {

        System.out.println(isFibonacci(2));
        System.out.println(isFibonacci(3));

    }
    private static long isFibonacci(int n){

        int j = 0, z = 1;

        for (int i = 1; i < n; i++) {

            z += j;

            j = z - j;
        }
        return z;
    }
}
