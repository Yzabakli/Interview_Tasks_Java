package number_tasks;

import java.util.Map;

public class Number_DivideWithoutDivision {
    public static void main(String[] args) {

        divideWithoutDivision(75, 4).entrySet().forEach(System.out::println);

    }
    private static Map<String, Integer> divideWithoutDivision(int dividend, int divisor){

        int count = 0;

        while (dividend >= divisor){

            dividend -= divisor;

            count++;
        }
        return Map.of("Quotient", count, "Remiander", dividend);
    }
}
