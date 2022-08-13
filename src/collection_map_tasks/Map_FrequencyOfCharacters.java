package collection_map_tasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        frequencyOfCharacters2("racecarleaksjfjalaebefleıfluvbfvudfjfçlsjdfvçvıasefıhhıdlsjahfhfeslhsdhfuıhsıdhfıjkfhsıdhdfıjshgfödshgosyyfeısjvbhdvybçosysbvsdfvuosısyvyvıyosçv");
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);

    }

    private static void frequencyOfCharacters(String str){

        HashMap<Character, Integer> map = new HashMap<>();

        for (char each : str.toCharArray()) {

            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            }
            map.putIfAbsent(each, 1);
        }

        System.out.println(map);
    }

    private static void frequencyOfCharacters2(String  str ) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {

            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }

        }

        System.out.println(map);
    }
}
