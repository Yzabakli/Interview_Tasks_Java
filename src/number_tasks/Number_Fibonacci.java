package number_tasks;

public class Number_Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));

    }
    private static long fibonacci(int n){

        int j = 0, z = 1;

        for (int i = 1; i < n; i++) {

            z += j;

            j = z - j;
        }
        return z;
    }
}
