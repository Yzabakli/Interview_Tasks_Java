package number_tasks;

public class Number_MaximumPossibleValue {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(maximumPossibleValue(-1234));
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);

    }
    private static int maximumPossibleValue(int num){

        String numToString = "";

        if (num > 0) {

            numToString = String.valueOf(num);

            for (int i = 0; i < numToString.length(); i++) {

                if (Integer.parseInt("" + numToString.charAt(i)) <= 5){

                   return Integer.parseInt(numToString.substring(0,i) + 5 + numToString.substring(i));
                }
            }
            return Integer.parseInt(numToString + "5");

        }else if (num < 0){

            numToString = String.valueOf(-num);

            for (int i = 0; i < numToString.length(); i++) {

                if (Integer.parseInt("" + numToString.charAt(i)) > 5){

                    return -Integer.parseInt(numToString.substring(0,i) + 5 + numToString.substring(i));
                }
            }
            return Integer.parseInt(numToString + "5") * -1;

        }else return 50;
    }
    private static int solution(int N) {
        String s = "" + Math.abs(N);
        int max = Integer.valueOf(s + 5);
        if (N > 0) {
            for (int i = 0; i < s.length(); i++) {
                String c = "" + s.charAt(i);
                String t = s.replaceFirst(c, 5 + c);
                if (Integer.valueOf(t) > max) {
                    max = Integer.valueOf(t);
                }
            }
        } else if (N < 0) {
            for (int i = 0; i < s.length(); i++) {
                String c = "" + s.charAt(i);
                String t = s.replaceFirst(c, 5 + c);
                if (Integer.valueOf(t) < max) {
                    max = Integer.valueOf(t);
                }
            }
            max = -max;
        } else {
            max = 50;
        }
        return max;
    }
}
