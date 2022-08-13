package string_tasks;

public class String_PhoneNumberReformat {
    public static void main(String[] args) {

        System.out.println(phoneNumberReformat("555372654"));

    }
    private static String phoneNumberReformat(String str){

        str = str.replace(" ", "").replace("-", "");

        String result = "";

        for (int i = 0, j = 3; i < str.length(); i+=3, j+=3) {

            if (j > str.length() - 1){
                result += str.substring(i);
                break;
            } else if (str.length() - i == 4) {
                result += str.substring(i,i+2) + "-" + str.substring(i+2);
                break;
            }
            result += str.substring(i, j) + "-";
        }
        return result;
    }
}
