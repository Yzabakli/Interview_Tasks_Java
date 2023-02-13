package other_algo_questions;

public class Reshape {
    public static void main(String[] args) {

        System.out.println(reshape(2, "12 34 56 789"));
    }

    static String reshape(int n, String str) {

        str = str.replaceAll(" ", "");

        for (int i = n; i < str.length(); i += n) {

            str = str.substring(0, i) + "\n" + str.substring(i);
            i++;
        }
        return str;
    }
}
