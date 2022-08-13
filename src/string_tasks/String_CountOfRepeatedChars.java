package string_tasks;

public class String_CountOfRepeatedChars {
    public static void main(String[] args) {

        System.out.println(countOfRepeatedChars("aabcccddaaaa"));

    }
    private static String countOfRepeatedChars(String word){

        String result = "";

        word = word.trim();

        for (int i = 0; i < word.length();) {

            int count = 1;

            int j;
            for (j = i + 1; j < word.length(); j++) {

                if (word.charAt(j) == word.charAt(i)) {

                    count++;
                } else break;
            }
            result += "" + word.charAt(i) + count;

            word = word.substring(j);
        }
        return result;
    }
}
