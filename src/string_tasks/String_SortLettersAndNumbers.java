package string_tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String_SortLettersAndNumbers {
    public static void main(String[] args) {

        System.out.println(sortLettersAndNumbers("DC501GCCCA098911"));

    }
    private static String sortLettersAndNumbers(String str){

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

            ArrayList<String> array = new ArrayList<>(List.of(each.split("")));

            Collections.sort(array);

            temp += array;
        }
        return temp.replace("[", "").replace("]", "").replace(", ", "");
    }
}
