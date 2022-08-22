package number_tasks;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Number_Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(10));
        System.out.println(fibonacci2(10));

    }
    private static long fibonacci2(int n){
        return Stream.iterate(new int[]{0,1},(a) -> new int[]{a[1], a[0] + a[1]})
                .limit(n)
                .collect(Collectors.toList()).get(n-1)[1];
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
