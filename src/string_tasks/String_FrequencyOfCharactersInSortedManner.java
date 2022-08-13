package string_tasks;

import java.util.Map;
import java.util.TreeMap;

public class String_FrequencyOfCharactersInSortedManner {
    public static void main(String[] args) {

        System.out.println(frequencyOfCharactersInSortedManner("DDDAACCCCCCB"));

    }
    private static String frequencyOfCharactersInSortedManner(String word){

        TreeMap<Character, Integer> map = new TreeMap<>();

        word = word.trim();

        for (int i = 0; i < word.length();) {

            int frequency = 1;

            int j;
            for (j = i + 1; j < word.length(); j++) {

                if (word.charAt(j) == word.charAt(i)) {

                    frequency++;
                }
            }
             map.put(word.charAt(i), frequency);

            word = word.replace("" + word.charAt(i), "");
        }
        String result = "";

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            result += entry;
        }

        return result.replace("=", "");
    }
}
