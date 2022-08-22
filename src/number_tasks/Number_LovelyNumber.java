package number_tasks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Collections.frequency;

public class Number_LovelyNumber {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(lovelyNumber2(1, 4879));
        System.out.println("elapsed time = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println(solutionWithMapAndStream(1, 4879));
        System.out.println("elapsed time = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println(lovelyNumber(1, 4879));
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

            int finalI = i;

            if (String.valueOf(i).chars().limit(String.valueOf(i).length() - 2).anyMatch(s -> Collections.frequency(String.valueOf(finalI).chars().boxed().collect(Collectors.toList()), s) > 2)){

                count--;
            }
        }
        return count;

    }

    private static int lovelyNumber2(int a, int b){
        return (int) IntStream.range(a,b+1).parallel().filter(Number_LovelyNumber::isLovely).count();
    }
    private static boolean isLovely(int num){
        Map<Character, Integer> digitFrequencies = new HashMap<>();

        char[] digitsAsCharArray = String.valueOf(num).toCharArray();

        for (char c : digitsAsCharArray) {
            digitFrequencies.put(c, digitFrequencies.getOrDefault(c, 0) + 1);

            if (digitFrequencies.getOrDefault(c, 0) > 2)
                return false;
        }

        return !digitFrequencies.containsValue(3);
    }
    public static int solutionWithNestedFor(int a, int b){
        int lovelyNumberCount = 0;

        //looping from A to B (both ends included)
        for (int i = a; i <= b; i++) {
            //getting all digits in the number as String List
            List<String> list = new ArrayList<>(Arrays.asList((i+"").split("")));

            boolean isNumberLovely = false;

            for (String eachDigit : list) {
                if(Collections.frequency(list, eachDigit) < 3)
                    isNumberLovely = true;
                else{
                    isNumberLovely = false;
                    break;//if we find a digit is occurring more than 2 times, then, no need to check rest. the number is not lovely number.
                }
            }
            if(isNumberLovely) {
                lovelyNumberCount++;
            }
        }

        return lovelyNumberCount;
    }

    public static int solutionWithMapAndStream(int a, int b){
        int lovelyNumberCount = 0;

        if (a < 1000){

            lovelyNumberCount = 1000 - a;

            if (b > 1000){
                lovelyNumberCount -= 9 - (a / 111);

            }else {
                return lovelyNumberCount - ((b / 111) - (a / 111));
            }
            a = 1000;
        }


        while (a <= b){
            Map<Character, Integer> digitFrequencies = new HashMap<>();

            char[] digitsAsCharArray = String.valueOf(a).toCharArray();

            for (char c : digitsAsCharArray) {
                digitFrequencies.put(c, digitFrequencies.getOrDefault(c, 0) + 1);

                //if the current digit occurs more than two, then no need to check other digits.
                if (digitFrequencies.getOrDefault(c, 0) > 2)
                    break;
            }

            //checking if there is any digit that has more than two frequencies.
            if (!digitFrequencies.containsValue(3))
                lovelyNumberCount++;

            a++;
        }

        return lovelyNumberCount;
    }
}
