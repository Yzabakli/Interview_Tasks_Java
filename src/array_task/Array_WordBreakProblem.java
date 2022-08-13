package array_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_WordBreakProblem {
    public static void main(String[] args) {

        String string = "applepenapple";

        System.out.println(wordBreakProblem3(Arrays.asList("leet", "code"), "leetcode"));
        // System.out.println(wordBreakProblem2(new String[]{"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"}, string));

    }

    private static String wordBreakProblem(String[] dictionary, String input) {

        boolean b = false;
        for (int i = 1; i < input.length() + 1; i++) {
            String temp = input.substring(0, i);
            String temp2 = input.substring(i);

            for (String each : dictionary) {
                if (each.equals(temp)) {
                    b = true;
                    break;
                }
                if (each.equals(temp2) && b) {
                    return "Yes";
                }
            }
        }
        return "No";
    }

    private static boolean wordBreakProblem2(List<String> dictionary, String input) {

        int b = 0;

        int m = Integer.MAX_VALUE;

        String length = input;

        int temp = 0;

        do {

            int i = 0;

            for (; i < dictionary.size(); i++) {

                m = Integer.min(m, dictionary.get(i).length());
                if (length.length() == 0) {
                    break;
                }
                for (int j = 0; j < 2; j++) {

                    if (length.contains(dictionary.get(i)) && length.indexOf(dictionary.get(i)) == 0) {
                        temp += dictionary.get(i).length();
                        length = length.substring(dictionary.get(i).length());
                        b++;
                    }
                }
            }
            i = dictionary.size() - 1;

            for (; i >= 0; i--) {

                if (length.length() == 0) {
                    break;
                }
                for (int j = 0; j < 2; j++) {

                    if (length.contains(dictionary.get(i)) && length.indexOf(dictionary.get(i)) == 0) {
                        temp += dictionary.get(i).length();
                        length = length.substring(dictionary.get(i).length());
                        b++;
                    }
                }
            }
            if (temp == input.length()) {
                return true;
            }
            if (length.length() < m) {
                return false;
            }

        } while (b > 0);


        return false;
    }

    private static boolean wordBreakProblem3(List<String> dictionary, String input) {

        int element = dictionary.get(0).length();

        boolean isLengthSame = true;
        for (String each : dictionary) {
            if (each.length() != element) {
                isLengthSame = false;
                break;
            }
        }

        if (isLengthSame) {

            String[] split = new String[input.length() / element];

            for (int i = 0, j = element, k = 0; k < split.length; i += element, j += element) {
                if (k != split.length - 1) {

                    split[k++] = input.substring(i, j);
                } else split[k++] = input.substring(i);
            }
            boolean isEqual = false;
            for (String each : split) {

                isEqual = false;

                for (String s : dictionary) {

                    if (each.equals(s)) {
                        isEqual = true;
                        break;
                    }
                }
                if (!isEqual) {
                    return false;
                }
            }
            return true;
        }
        int b;

        int m = 0;

        int shortestWord = Integer.MAX_VALUE;

        ArrayList<String> list = new ArrayList<>();

        String length = input;

        int temp = 0;

        do {

            int l = 0;

            b = 0;

            if (length.length() <= shortestWord) {


                length = input;
                temp = 0;
                l = m++;
                list = new ArrayList<>();
            }

            if (l == dictionary.size()) {
                return false;
            }

            boolean loop = false;
            for (int i = 0; i < dictionary.size(); i++, l++) {

                if (l == dictionary.size()) {
                    l = 0;
                }
                shortestWord = Integer.min(shortestWord, dictionary.get(l).length());
                if (length.length() == 0) {
                    break;
                }
                for (int j = 0; j < 2; j++) {

                    if (length.contains(dictionary.get(l))) {
                        temp += dictionary.get(l).length();
                        if (length.indexOf(dictionary.get(l)) == 0) {

                            if (!list.isEmpty()) {
                                for (String each : list) {

                                    if (each.contains(dictionary.get(l))) {
                                        loop = true;
                                        break;
                                    }
                                }
                                if (!loop) {
                                    return false;
                                }
                            }
                            length = length.substring(dictionary.get(l).length());

                        } else {
                            if (!list.isEmpty()) {
                                for (String each : list) {

                                    if (each.contains(dictionary.get(l))) {
                                        loop = true;
                                        break;
                                    }
                                }
                                if (!loop) {
                                    return false;
                                }
                            }
                            list = new ArrayList<>(Arrays.asList(length.substring(0, length.lastIndexOf(dictionary.get(l))), length.substring(length.lastIndexOf(dictionary.get(l)) + dictionary.get(l).length())));
                            length = length.substring(0, length.indexOf(dictionary.get(l))) +
                                    length.substring(length.indexOf(dictionary.get(l)) + dictionary.get(l).length());
                            if (length.equals(dictionary.get(l))) {
                                return false;
                            }
                        }


                        b++;
                    }
                }
            }
            if (temp == input.length()) {
                return true;
            }

        } while (b > 0);


        return false;
    }

    private static boolean wordBreakProblem4(List<String> dictionary, String input) {

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                String temp = input.substring(i, j + 1);
                if (dictionary.contains(temp)) {
                    if (!words.contains(temp)) {
                        words.add(temp);
                    }
                }
            }
        }

        return (words.size() > 0);
    }
}
