package string_tasks;

public class String_SumOfAllIntegers {
    public static void main(String[] args) {

        System.out.println(sumOfAllIntegers("12 some text 3 7"));

    }
    private static int sumOfAllIntegers(String num){

        int index = 0;

        boolean b;

        if (Character.isDigit(num.charAt(0))){

         b = true;

        }else b = false;

        int sum = 0;

        for (int i = 0; i < num.length(); i++) {

            if (Character.isDigit(num.charAt(i)) && b){
                index = i;
                b = false;
            }
            if (!Character.isDigit(num.charAt(i)) && !b){

                sum += Integer.parseInt(num.substring(index, i));
                b = true;
            }
            if (i == num.length()-1 && Character.isDigit(num.charAt(i))){

                if (Character.isDigit(num.charAt(i-1))){
                    sum += Integer.parseInt(num.substring(index, i));
                }else sum += Integer.parseInt(num.substring(i));
            }
        }
        return sum;
    }
}
