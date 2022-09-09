package string_tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_PrintEmail {
    public static void main(String[] args) {

        System.out.println(getEmail2("I love Java name@gmail.com, I don't like python"));
    }
    private static String getEmail(String sentence){

        Matcher match = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(sentence);
        return match.find() ? match.group() : null;
    }

    private static String getEmail2(String sentence){

        return sentence.replaceAll(".*\\b(\\w\\S*@\\S*\\w)\\b.*", "$1");
    }
}
