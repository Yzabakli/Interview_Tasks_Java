package string_tasks;

import java.util.List;
import java.util.TreeSet;

public class String_Anagram {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(isAnagram("hsdfgjsalsgasdfghjkllsfalsldfhfl", "asdfdsfdfsasdfghjkldfhjlfkljfljglkgfhjk"));
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);

    }
    private static boolean isAnagram(String str1, String str2){

        for (int i = 0; i < str1.length(); i++) {

            if (!str2.contains("" + str1.charAt(i))){

                return false;
            }
        }

        for (int i = 0; i < str2.length(); i++) {

            if (!str1.contains("" + str2.charAt(i))){

                return false;
            }
        }
        return true;
    }
    private static boolean isAnagram2(String str1, String str2){

        TreeSet<String> set1 = new TreeSet<>(List.of(str1.split("")));
        TreeSet<String> set2 = new TreeSet<>(List.of(str2.split("")));

        return set1.equals(set2);
    }
}
