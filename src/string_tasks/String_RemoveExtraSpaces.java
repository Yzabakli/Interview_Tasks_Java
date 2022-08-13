package string_tasks;

public class String_RemoveExtraSpaces {
    public static void main(String[] args) {

        System.out.println(removeExtraSpace("  Hello world      I      love      Java    "));

    }
    private static String removeExtraSpaces(String str){

        str = str.trim();

        String[] array = str.split("");

        str = "";

        int count = 0;

        for (String each : array) {

            if (each.equals(" ")){

                count++;
            }else count = 0;

            if (count == 1) {

                str += " ";
            }
            if (!each.equals(" ")){
                str += each;
                count = 0;
            }
        }
        return str;
    }
    private static String removeExtraSpace(String sentence) {

        String[] words = sentence.trim().split(" ");
        String result = "";

        for (String each : words) {
            if (!each.isEmpty()) {
                result += each + " ";
            }
        }

        return result.trim();

    }
}
