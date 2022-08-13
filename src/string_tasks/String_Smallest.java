package string_tasks;

import java.util.TreeSet;

public class String_Smallest {
    public static void main(String[] args) {

        System.out.println(smallest("codility"));

    }
    private static String smallest(String str){

        TreeSet<String> set = new TreeSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.substring(0, i) + str.substring(i+1));
        }

        return set.first();
    }
}
