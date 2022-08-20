package number_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Collections.frequency;

public class Number_LovelyNumber {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(countLovelyNumbers(1, 4879));
        System.out.println("elapsed time = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println(lovelyNumber(1099, 4879));
        System.out.println(lovelyNumber(5, 110));
        System.out.println("elapsed time = " + (System.currentTimeMillis() - start));
    }

    private static int lovelyNumber(int a, int b){

        if (a == b){

            for (String str : String.valueOf(a).split("")) {

                if (frequency(List.of(String.valueOf(a).split("")), str) > 2){
                    return 0;
                }
            }
            return 1;
        }

        int count = b - a + 1;

        if (a < 1000){

            if (b > 1000){
                count -= 9 - (a / 111);
            }else {
                return count - ((b / 111) - (a / 111));
            }
        }


        for (int i = Math.max(a, 1000); i <= b; i++) {

            Stream<String> stream = Stream.of(String.valueOf(i).split(""));

            int finalI = i;

            if (stream.anyMatch(s -> Collections.frequency(List.of(String.valueOf(finalI).split("")), s) > 2)){

                count--;
            }
        }
        return count;

    }
    public static int countLovelyNumbers(int a, int b){
        int count = 0;
        for (int i = a; i <= b; i++) {
            List<String> list = new ArrayList<>(Arrays.asList((i+"").split("")));
            boolean result = false;

            for (String each : list) {
                if (frequency(list, each) < 3) {
                    result = true;
                    break;
                }
            }
            if(result) {
                count++;
            }
        }

        return count;
    }
}
