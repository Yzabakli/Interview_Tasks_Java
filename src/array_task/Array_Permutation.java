package array_task;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Array_Permutation {
    public static void main(String[] args) {

        printPermutation(new char[]{'a', 'b', 'c'});
    }

    private static void permutation(char[] array) {

        int arrLength = 1;
        for (int i = 2; i < array.length + 1; i++) {
            arrLength *= i;
        }

        char[][] arr = new char[arrLength][array.length];

        int ind = 0;
        int arrInd = 0;

        for (int j = 0; j < array.length; j++) {
            int i = 0;
            int t = 1;
            for (; t < array.length; i++, t++) {

                arr[arrInd][0] = array[ind];

                if (i == ind) {

                    i++;
                }
                arr[arrInd][t] = array[i];
            }
            arrInd++;

            t = 1;

            int k = array.length - 1;

            for (; t < array.length; k--, t++) {

                arr[arrInd][0] = array[ind];

                if (k == ind) {

                    k--;
                }
                arr[arrInd][t] = array[k];
            }
            arrInd++;
            ind++;
        }

        for (char[] each : arr) {
            System.out.println(Arrays.toString(each));
        }
    }

    private static void permutation2(char[] array) {

        for (int i = 0; i < array.length; i++) {
            var result = "" + array[i];
            int k = 1;

            for (int j = i + 1; k < array.length; j++, k++) {

                if (j == array.length) j = 0;

                result += array[j];
            }
            System.out.println(result);
            result = "" + array[i];
            k = 1;
            for (int j = i + 2; k < array.length; j++, k++) {

                if (j == i) j++;
                if (j >= array.length) j = j - array.length;

                result += array[j];
            }
            System.out.println(result);
        }
    }

    public static void printPermutation(char[] ch) {
        for (String s : solution(ch)) {
            System.out.println(Arrays.toString(s.toCharArray()));
        }
    }

    public static Set<String> solution(char[] ch) {
        String str = Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", "");
        Set<String> set = new LinkedHashSet<>();

        if (str.length() == 1) {
            set.add(str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String a3 = str.substring(0, i) + str.substring(i + 1);
                char[] ch2 = a3.toCharArray();
                for (String permutation : solution(ch2)) {
                    set.add(str.charAt(i) + permutation);
                }
            }

        }

        return set;
    }
}
