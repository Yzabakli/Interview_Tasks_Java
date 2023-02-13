package other_algo_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String[] args) {

//        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));
//        System.out.println(Arrays.toString(kidsWithCandies_2(new int[]{2,3,5,1,3}, 3)));
//        System.out.println(Arrays.toString(kidsWithCandies_3(new int[]{2,3,5,1,3}, 3)));
//
//        System.out.println(Arrays.toString(kidsWithCandies(new int[]{4,2,1,1,2}, 1)));
//        System.out.println(Arrays.toString(kidsWithCandies_2(new int[]{4,2,1,1,2}, 1)));
//        System.out.println(Arrays.toString(kidsWithCandies_3(new int[]{4,2,1,1,2}, 1)));
//
//        System.out.println(Arrays.toString(kidsWithCandies(new int[]{12,1,12}, 10)));
//        System.out.println(Arrays.toString(kidsWithCandies_2(new int[]{12,1,12}, 10)));
//        System.out.println(Arrays.toString(kidsWithCandies_3(new int[]{12,1,12}, 10)));

//        int[] damnThatIsABigOne = IntStream.range(0, 999999999).toArray();
// until 8 digits "for loop" is faster than parallel stream
// 2147483647
//  999999999
        int size = 1000900000;
        int[] damnThatIsABigOne = new int[size];

        Random random = new Random();

        Arrays.setAll(damnThatIsABigOne, i -> random.nextInt());

        var start = System.currentTimeMillis();
        kidsWithCandies(damnThatIsABigOne, 10);
        System.out.println(System.currentTimeMillis() - start);
    }

    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) { // 1753  1000900000 1704

        var booleanList = new boolean[candies.length];
        var maxCandies = candies[0];

        for (int candy : candies) maxCandies = Math.max(maxCandies, candy);

        for (int i = 0; i < candies.length; i++) booleanList[i] = candies[i] + extraCandies >= maxCandies;

        return booleanList;
    }

    public static boolean[] kidsWithCandies_2(int[] candies, int extraCandies) { // 2360  1000900000

        var mostCandies = candies[0];
        var booleanArray = new boolean[candies.length];
        int j;

        for (int i = 0, k = candies.length - 1; i < candies.length; i++, k--) {

            j = i - candies.length / 2;

            mostCandies = Math.max(mostCandies, candies[i]);
            mostCandies = Math.max(mostCandies, candies[k]);

            if (j >= 0 && booleanArray[j]) {

                booleanArray[j] = candies[j] + extraCandies >= mostCandies;
            }

            booleanArray[i] = candies[i] + extraCandies >= mostCandies;
        }

        return booleanArray;
    }

    public static boolean[] kidsWithCandies_3(int[] candies, int extraCandies) { // 644  1000900000

        int mostCandies = Arrays.stream(candies).parallel().max().orElse(0);
        boolean[] booleanArray = new boolean[candies.length];
        IntStream.range(0, candies.length).parallel().forEach(i -> booleanArray[i] = candies[i] + extraCandies >= mostCandies);

        return booleanArray;
    }
}
