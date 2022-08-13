package string_tasks;

import java.util.ArrayList;

public class String_ReverseConsecutiveStrings {
    public static void main(String[] args) {

        System.out.println(reverseConsecutiveStrings("test12pop90java989pyt"));

    }
    private static String reverseConsecutiveStrings(String str){

        ArrayList<String> list = new ArrayList<>();

        boolean digit = false;

        for (int i = 0; i < str.length(); i++) {

            if (!digit && Character.isDigit(str.charAt(i))){
                list.add(str.substring(0, i));
                str = str.substring(i);
                digit = true;
                i = 0;
            }
            if (digit && Character.isLetter(str.charAt(i))){
                list.add(str.substring(0, i));
                str = str.substring(i);
                digit = false;
                i = 0;
            }
            if (i == str.length() - 1){

                list.add(str);
            }
        }
        String temp = "";
        for (String each : list) {

            if (Character.isLetter(each.charAt(0))){

                for (int i = each.length() - 1; i >= 0; i--) {

                    temp += "" + each.charAt(i);
                }
            }else {
                temp += "" + each;
            }
        }
        return temp;
    }
}
