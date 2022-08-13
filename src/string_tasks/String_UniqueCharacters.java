package string_tasks;

import java.util.Collections;
import java.util.List;

public class String_UniqueCharacters {
    public static void main(String[] args) {

        System.out.println(uniqueCharacters2("AAABBBCCCDEF"));

    }
    private static String uniqueCharacters(String str){

        String temp = "";

        for (int i = 0; i < str.length();) {

            if (Collections.frequency(List.of(str.split("")), "" + str.charAt(i)) == 1){

                temp += str.charAt(i);
            }
            str = str.replace("" + str.charAt(i), "");
        }
        return temp;
    }

    private static String uniqueCharacters2(String str) {

        String temp = "";

        for (int i = 0; i < str.length(); ) {

            int frequency = 1;

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(j) == str.charAt(i)) {

                    frequency++;
                }
            }
            if (frequency == 1) {

                temp += str.charAt(i);
            }
            str = str.replace("" + str.charAt(i), "");
        }
        return temp;
    }
}
