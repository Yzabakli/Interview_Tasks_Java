package number_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Number_LovelyNumber {
    public static void main(String[] args) {

        System.out.println(lovelyNumber(333, 333));
// 1000 1011,1111,1211... 1101,1121... 1110,1112...
    }
    private static int lovelyNumber(int a, int b){

        if (b < 111){

            if (a == b){
                return 1;
            }
            return b - a + 1;

        } else {

            if (a == b){

                for (int j = 0; j < 10; j++) {

                    if (Collections.frequency(Arrays.asList(String.valueOf(a).split("")), String.valueOf(j)) > 2){
                        return 0;
                    }
                }
                return 1;
            }

            int count = b - a + 1;

            int i;

            count -= b / 111;

            if (b > 999){

                for (i = 1000; i < b; i++) {

                    for (int j = 0; j < 10; j++) {

                        if (Collections.frequency(Arrays.asList(String.valueOf(i).split("")), String.valueOf(j)) > 2){
                            count--;
                            break;
                        }
                    }
                }
            }
            return count;
        }
    }
    public static int countLovelyNumbers(int a, int b){
        int count = 0;
        for (int i = a; i <= b; i++) {
            List<String> list = new ArrayList<>(Arrays.asList((i+"").split("")));
            boolean result = false;

            for (String each : list) {
                if(Collections.frequency(list, each) < 3)
                    result = true;
            }
            if(result) {
                count++;
            }
        }

        return count;
    }
}
