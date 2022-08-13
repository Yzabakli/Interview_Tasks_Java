package string_tasks;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class String_PermutationsOfString {
    public static void main(String[] args) {

        permutationsOfString("abc");

    }
    public static void permutationsOfString(String ch) {
        for (String s : defaultSolution_permutation(ch)) {
            System.out.print(s + " ");
        }
    }

    public static Set<String> defaultSolution_permutation(String ch) {
        String str = Arrays.toString(ch.toCharArray()).replace(", ", "").replace("[", "").replace("]", "");
        Set<String> set = new LinkedHashSet<>();

        if (str.length() == 1) {
            set.add(str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String a3 = str.substring(0, i) + str.substring(i + 1);
                char[] ch2 = a3.toCharArray();
                for (String permutation : defaultSolution_permutation(String.valueOf(ch2))) {
                    set.add(str.charAt(i) + permutation);
                }
            }

        }

        return set;
    }
}
