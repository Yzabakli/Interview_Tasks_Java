package string_tasks;

import java.util.Collections;
import java.util.List;

public class String_IndexOfFirstUniqueChar {
    public static void main(String[] args) {

        System.out.println(indexOfFirstUniqueChar2("aabbcc"));

    }
    private static int indexOfFirstUniqueChar(String str){

        String temp = str;

        for (; 0 < temp.length();) {

            if (Collections.frequency(List.of(temp.split("")), "" + temp.charAt(0)) == 1){

                return str.indexOf(temp.charAt(0));
            }
            temp = temp.replace("" + temp.charAt(0), "");
        }
        return -1;
    }

    private static int indexOfFirstUniqueChar2(String str){

        String temp = str;

        for (; 0 < temp.length();) {

            int frequency = 1;

            for (int j = 1; j < temp.length(); j++) {

                if (temp.charAt(j) == temp.charAt(0)){

                    frequency++;
                }
            }
            if (frequency == 1){

                return str.indexOf(temp.charAt(0));
            }
            temp = temp.replace("" + temp.charAt(0), "");
        }
        return -1;
    }
}
