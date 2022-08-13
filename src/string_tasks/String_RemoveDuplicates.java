package string_tasks;

public class String_RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AAABBBCCC";

        System.out.println(removeDuplicates(str));

        System.out.println(str);

    }
    private static String removeDuplicates(String str){

        String result = "";

        for (; 0 < str.length();) {

            result += str.charAt(0);

            str = str.replace("" + str.charAt(0), "");
        }
        return result;
    }
}
