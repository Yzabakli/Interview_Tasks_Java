package string_tasks;

import java.util.ArrayList;

public class String_DisplayALlDistinctStrings {
    public static void main(String[] args) {

        System.out.println(displayALlDistinctStrings("abb"));

    }
    private static ArrayList<String> displayALlDistinctStrings(String str){

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {

                list.add(str.substring(i,j));
            }
        }
        return list;
    }
}
