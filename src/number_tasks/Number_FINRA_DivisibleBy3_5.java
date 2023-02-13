package number_tasks;

import java.util.Arrays;

public class Number_FINRA_DivisibleBy3_5 {
    public static void main(String[] args) {

        System.out.println(010);
        System.out.println(07);

    }
    private static void fINRA() {

        for (int i = 1; i <= 30; i++) {

            if (i % 5 == 0 && i % 3 == 0){

                System.out.println("FINRA");

            } else if (i % 5 == 0){

                System.out.println("RA");

            } else if (i % 3 == 0){

                System.out.println("FIN");

            }else System.out.println(i);
        }
    }

    private static void typeCounter(String p) {

        int st = 0, in = 0, db = 0;

        for (String c : p.trim().split(" ")) {

            if (c.equals("")) continue;
            if (Character.isLetter(c.charAt(0))) st++;
            else if (c.contains(".")) db++;
            else in++;
        }

        System.out.println("string " + st);
        System.out.println("integer " + in);
        System.out.println("double " + db);


    }
}
