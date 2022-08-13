package string_tasks;

public class String_PassWordValidation {
    public static void main(String[] args) {

        System.out.println(passWordValidation("!!!!!!!!!!!!aB1"));

    }
    private static boolean passWordValidation(String password){

        if (password.length() > 5 && !password.contains(" ")){

            boolean uCase = false;
            boolean lCase = false;
            boolean special = false;
            boolean digit = false;
            for (int i = 0; i < password.length(); i++) {

                if (uCase && lCase && special && digit){
                    break;
                }

                if (Character.isUpperCase(password.charAt(i))){
                    uCase = true;
                } else if (Character.isLowerCase(password.charAt(i))) {
                    lCase = true;
                } else if (!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))) {
                    special = true;
                } else if (Character.isDigit(password.charAt(i))) {
                    digit = true;
                }
            }
            if (uCase && lCase && special && digit){
                return true;
            }
        }
        return false;
    }
}
