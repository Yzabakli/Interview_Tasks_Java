package number_tasks;

import java.util.TreeSet;

public class Number_DivisibleBy3_5_15 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        divisibleBy3_5_15(300000);
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);

    }
    private static void divisibleBy3_5_15(int N){

        TreeSet<Integer> divisibleBy15 = new TreeSet<>();
        TreeSet<Integer> divisibleBy5 = new TreeSet<>();
        TreeSet<Integer> divisibleBy3 = new TreeSet<>();


        for (int i = 3; i < N + 1; i++) {

            if (i % 15 == 0){

                divisibleBy15.add(i);

            } else if (i % 5 == 0){

                divisibleBy5.add(i);

            } else if (i % 3 == 0){

                divisibleBy3.add(i);
            }
        }

        System.out.println("Divisible By 15 " + divisibleBy15.toString().replace("[", "")
                .replace("]", "").replace(",", ""));
        System.out.println("Divisible By 5 " + divisibleBy5.toString().replace("[", "")
                .replace("]", "").replace(",", ""));
        System.out.println("Divisible By 3 " + divisibleBy3.toString().replace("[", "")
                .replace("]", "").replace(",", ""));


    }
    private static void solution(int n) {
        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int each : arr) {

            if (each % 15 == 0) {
                divisibleBy15 += each + " ";
            }

            if (each % 5 == 0 && each % 15 != 0) {
                divisibleBy5 += each + " ";
            }

            if (each % 3 == 0 && each % 15 != 0) {
                divisibleBy3 += each + " ";
            }

        }
        System.out.println("Divisible By 15: " + divisibleBy15);
        System.out.println("Divisible By 5: " + divisibleBy5);
        System.out.println("Divisible By 3: " + divisibleBy3);
    }
}
