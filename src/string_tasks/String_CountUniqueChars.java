package string_tasks;

import java.util.Collections;
import java.util.List;

public class String_CountUniqueChars {
    public static void main(String[] args) {

        countUniqueChars("aaaabbcc");

    }
    private static void countUniqueChars(String str){

        int count = 0;

        for (int i = 0; i < str.length();) {

            if (Collections.frequency(List.of(str.split("")), "" + str.charAt(i)) == 1){

                count++;
            }
            str = str.replace("" + str.charAt(i), "");
        }
        if (count != 0)System.out.println(count);else System.out.println(-1);
    }

    private static void countUniqueChars2(String str){

        int count = 0;

        for (int i = 0; i < str.length();) {

            int frequency = 1;

            for (int j = i+1; j < str.length(); j++) {

                if (str.charAt(j) == str.charAt(i)){

                    frequency++;
                }
            }
            if (frequency == 1){

                count++;
            }
            str = str.replace("" + str.charAt(i), "");
        }
        if (count != 0)System.out.println(count);else System.out.println(-1);
    }
}
