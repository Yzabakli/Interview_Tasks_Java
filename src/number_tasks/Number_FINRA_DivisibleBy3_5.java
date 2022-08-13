package number_tasks;

public class Number_FINRA_DivisibleBy3_5 {
    public static void main(String[] args) {

        fINRA();

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
}
