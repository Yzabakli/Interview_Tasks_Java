package number_tasks;

import java.util.Collections;
import java.util.List;

public class Number_BinaryRepresentationOfN {
    public static void main(String[] args) {

        System.out.println(getCountOfOnes2(464347383));

    }
    private static int getCountOfOnes(int n) {

        return Collections.frequency(List.of(Integer.toBinaryString(n).split("")), "1");
    }
    private static int getCountOfOnes2(int n) {

        String s = "";
        boolean result = n > 0;

        while (result) {
            s = ((n % 2) == 0 ? "0" : "1") + s;
            n = n / 2;
            result = n > 0;
        }

        int count = 0;
        for (char each : s.toCharArray()) {
            if (each == '1') {
                count++;
            }
        }

        return count;
    }
}
