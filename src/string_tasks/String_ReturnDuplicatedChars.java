package string_tasks;

public class String_ReturnDuplicatedChars {
    public static void main(String[] args) {

        System.out.println(returnDuplicatedChars("inteerrrviiew"));

    }
    private static String returnDuplicatedChars(String str){

        String result = "";

        for (; 0 < str.length();) {

            int frequency = 1;

            for (int j = 1; j < str.length(); j++) {

                if (str.charAt(0) == str.charAt(j)){

                    frequency++;
                }
            }
            if (frequency > 1){

                result += "" + str.charAt(0);
            }
            str = str.replace("" + str.charAt(0), "");
        }
        return result;
    }
}
