package collection_map_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemovePalindromeStrings {
    public static void main(String[] args) {

        System.out.println(removePalindromeStrings(new ArrayList<>(Arrays.asList("name", "racecar", "car", "pop", "kototokkototok"))));

    }

    private static List<String> removePalindromeStrings(List<String> list){

        for (int i = 0; i < list.size(); i++) {

            String each = list.get(i);

            String reverse = "";

            for (int j = each.length() - 1; j >= 0; j--) {

                reverse += each.charAt(j);
            }

            if (reverse.equalsIgnoreCase(each)) {

                list.remove(each);
                i--;
            }
        }

        return list;
    }
}
