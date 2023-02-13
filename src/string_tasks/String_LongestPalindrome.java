package string_tasks;

import java.util.ArrayList;
import java.util.HashSet;

public class String_LongestPalindrome {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(longestPalindrome2("bhjsbfdbfbsdbjaöbshjfbdjsöbdfbghdfgjugjdbjdhgvbfjdbgjfracecarnkadsfnkfnadkfnksandfçnskçfnçksfkjkgbsfdkgöjdbgdjdögbföjabdgkjödabögbkjdbafgbadjfndçfnkçsn"));
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);
    }
    private static String longestPalindrome(String str){

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {

                set.add(str.substring(i,j));
            }
        }
        String longest = "";

        for (String each : set) {

            boolean isPalindrome = true;

            for (int i = 0, j = each.length() - 1; i < each.length(); i++, j--) {

                if (each.charAt(i) != each.charAt(j)){
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome && each.length() > longest.length()){
                longest = each;
            }
        }
        return longest;
    }
    private static String longestPalindrome1(String str) {
        String longest = "";
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {
                list.add(str.substring(i, j));
            }

        }

        for (String each : list) {

            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }

            if (each.equalsIgnoreCase(reverse) && each.length() > longest.length()) {
                longest = each;
            }

        }

        return longest;
    }
    private static String longestPalindrome2(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i = i + 1) {
            int b = i;
            int e = i;
            while (b >= 0 && e <= s.length() - 1 && s.charAt(b) == s.charAt(e)) {
                b--;
                e++;
            }
            String temp = s.substring(b + 1, e);
            if (temp.length() > result.length()) result = temp;


            b = i; // for even length palindromes
            e = i + 1;
            while (b >= 0 && e <= s.length() - 1 && s.charAt(b) ==
                    s.charAt(e)) {
                b--;
                e++;
            }
            temp = s.substring(b + 1, e);
            if (temp.length() > result.length()) {
                result = temp;
            }
        }

        return result;
    }
}
