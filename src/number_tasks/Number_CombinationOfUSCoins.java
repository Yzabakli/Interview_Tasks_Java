package number_tasks;

public class Number_CombinationOfUSCoins {
    public static void main(String[] args) {

        System.out.println(solution(11));

    }
    private static int combinationOfUSCoins(int cents){

        int dime = 10, quarter = 25, halfDollar = 50;
        
        if (cents >= 1){

            if (cents >= 5){

                int count5 = 0;

                for (int i = 1; i * 5 <= cents; i++) {

                    count5++;
                }

                if (cents >= dime){

                    int count10 = 0;

                    count10 = getCount(cents, dime, count5, count10);

                    if (cents >= quarter){

                        int count25 = 0;

                        count25 = getCount(cents, quarter, count10, count25);

                        if (cents >= halfDollar){

                            int count50 = 0;

                            count50 = getCount(cents, halfDollar, count25, count50);

                            return count50 + 1;

                        }else return count25 + 1;

                    }else return count10 + 1;

                }else return count5 + 1;

            }else return 1;
        }

        return 0;
    }

    private static int getCount(int cents, int coin, int count5, int count10) {
        for (int i = 1; i * coin <= cents; i++) {

            if (i * coin == cents){
                count10++;
                continue;
            }
            count10 += combinationOfUSCoins(cents - i * coin);
        }

        count10 += count5;

        return count10;
    }

    private static int solution(int cents) {
        int count = 0;
        int[] coins = {1, 5, 10, 25, 50};
        int[][] s = new int[coins.length + 1][cents + 1];

        // if amount=0 then just return empty set to make the change
        for (int i = 0; i <= coins.length; i++) {
            s[i][0] = 1;
        }

        // now fill rest of the matrix.
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= cents; j++) {
                // check if the coin value is less than the amount needed
                if (coins[i - 1] <= j) {
                    // reduce the amount by coin value and
                    // use the subproblem solution (amount-v[i]) and
                    // add the solution from the top to it
                    s[i][j] = s[i - 1][j] + s[i][j - coins[i - 1]];
                } else {
                    // just copy the value from the top
                    s[i][j] = s[i - 1][j];
                }
            }
        }
        return s[coins.length][cents];

    }

    private static int nestedFor(int amount, int[] coins) {
        if (amount < 0) {
            return 0;
        }

        if (coins == null || coins.length == 0) {
            return 0;
        }
        // Create an array that memorizes the number of ways to make change for each amount
        // and also keeps the total counted ways
        int[] ways = new int[amount + 1];
        ways[0] = 1;
        // start from each denomination and update ways array for each remaining amount
        for (int coin : coins) {
            // we need to update ways of getting change for every amount from 1 to amount
//            for(int i = 1; i <= amount; i++) {
//                // make sure our coin is at least the value of current amount
//                if(coin <= i) {
//                    ways[i] += ways[i-coin];
//                }
//            }
            //We simplify the inner for loop slightly by changing is as below
            for (int i = coin; i <= amount; ++i) {
                ways[i] += ways[i - coin];
            }
        }
        return ways[amount];
    }
}
