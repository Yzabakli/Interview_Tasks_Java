package string_tasks;

public class String_Reverse {
    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));

    }
    private static String reverse(String str){

        String a = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            a += str.charAt(i);
        }
        return a;
    }
}
