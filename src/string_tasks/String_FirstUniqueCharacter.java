package string_tasks;

import java.util.Collections;
import java.util.List;

public class String_FirstUniqueCharacter {
    public static void main(String[] args) {

        System.out.println(firstUniqueCharacter2("aabcc"));

    }
    private static char firstUniqueCharacter(String str){

        for (int i = 0; i < str.length();) {

            if (Collections.frequency(List.of(str.split("")), "" + str.charAt(i)) == 1){

                return str.charAt(i);
            }
            str = str.replace("" + str.charAt(i), "");
        }
        throw new RuntimeException("all characters are repeated");
    }

    private static char firstUniqueCharacter2(String str){

        for (int i = 0; i < str.length();) {

            int frequency = 1;

            for (int j = i+1; j < str.length(); j++) {

                if (str.charAt(j) == str.charAt(i)){

                    frequency++;
                }
            }
            if (frequency == 1){

                return str.charAt(i);
            }
            str = str.replace("" + str.charAt(i), "");
        }
        throw new RuntimeException("all characters are repeated");
    }
}
