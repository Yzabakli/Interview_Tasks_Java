package string_tasks;

public class String_CountOfRepeatedChars {
    public static void main(String[] args) {

        System.out.println(countOfRepeatedChars("aabcccddaaaa"));

    }
    private static String countOfRepeatedChars(String word){

        String result = "";

        word = word.trim();

        while (word.length() > 0){

            int count = 1;

            int i;
            for (i = 1; i < word.length(); i++) {

                if (word.charAt(i) == word.charAt(0)) {

                    count++;
                } else break;
            }
            result += "" + word.charAt(0) + count;

            word = word.substring(i);
        }
        return result;
    }
}
