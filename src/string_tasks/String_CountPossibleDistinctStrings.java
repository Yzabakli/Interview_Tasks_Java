package string_tasks;

import java.util.HashSet;

public class String_CountPossibleDistinctStrings {
    public static void main(String[] args) {

        System.out.println(countPossibleDistinctStrings("aaa"));

    }
    private static int countPossibleDistinctStrings(String str){

        HashSet<String> list = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {

                list.add(str.substring(i,j));
            }
        }
        return list.size();
    }
}
