package string_tasks;

public class String_ConvertStringToInteger {
    public static void main(String[] args) {

        int i = convertStringToInteger("0");

        System.out.println(i);

    }
    private static int convertStringToInteger(String num){

        int number = 0;

        if (!num.startsWith("-")){

            for (int i = num.length() - 1, j = 1; i >= 0; i--, j*=10) {

                number += (num.charAt(i) - 48) * j;
            }
            return number;

        }else {

            for (int i = num.length() - 1, j = 1; i >= 1; i--, j*=10) {

                number += (num.charAt(i) - 48) * j;
            }
            return -number;
        }
    }
}
