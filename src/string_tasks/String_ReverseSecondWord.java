package string_tasks;

public class String_ReverseSecondWord {
    public static void main(String[] args) {

        System.out.println(reverseSecondWord("I love java"));

    }
    private static String reverseSecondWord(String str){

        String[] array = str.split(" ");

        String temp = "";

        for (int i = array[1].length() - 1; i >= 0; i--) {

            temp += "" + array[1].charAt(i);
        }
        String result = array[0] + " " + temp + " ";

        for (int i = 2; i < array.length; i++) {

            if (i == array.length - 1){
                result += array[i];
                break;
            }
            result += array[i] + " ";
        }
        return result;
    }
}
