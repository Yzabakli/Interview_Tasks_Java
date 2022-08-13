package number_tasks;

public class Number_Fibonacci {
    public static void main(String[] args) {

        System.out.println(isFibonacci(10));

    }
    private static long isFibonacci(int n){

        int result = 0;
        int j = 0;
        int z = 1;

        for (int i = 2; i < n; i++) {

            result = j + z;

            j = z;

            z = result;
        }
        return result;
    }
}
