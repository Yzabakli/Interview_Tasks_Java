package string_tasks;

public class String_FrequencyOfCharacters {
    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("AAABBCDD"));

    }
    private static String frequencyOfCharacters(String word){

        String result = "";

        word = word.trim();

        for (int i = 0; i < word.length();) {

            int count = 1;

            int j;
            for (j = i + 1; j < word.length(); j++) {

                if (word.charAt(j) == word.charAt(i)) {

                    count++;
                }
            }
            result += "" + word.charAt(i) + count;

            word = word.replace("" + word.charAt(i), "");
        }
        return result;
    }
}
