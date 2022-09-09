package string_tasks;

public class String_PalindromeSubString {
    public static void main(String[] args) {

    }
    private static String PalindromeSubstring(String str) {

        String result = "";
        int max = 0;
        for (int i = 1; i < str.length(); i++) {
            int j = i, l = i;
            while (--j >= 0 && ++l <= str.length() - 1) {
                if (isPalindrome(str.substring(j, l))) {
                    int length = str.substring(j, l).length();
                    if (length > max) {
                        max = length;
                        result = str.substring(j, l);
                    }
                }
            }
        }
        return (result.isEmpty()) ? "none" : result;
    }

    private static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
