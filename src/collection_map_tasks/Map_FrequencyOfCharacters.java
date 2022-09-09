package collection_map_tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        frequencyOfCharacters3("racecar");
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);

    }

    private static void frequencyOfCharacters(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char each : str.toCharArray()) {

            map.put(each, map.getOrDefault(each, 0) + 1);

        }

        System.out.println(map);
    }

    private static void frequencyOfCharacters3(String str){

        Map<String, Integer> map = new LinkedHashMap<>();

        Arrays.stream(str.split("")).forEach(s -> map.put(s, map.getOrDefault(s, 0) + 1));

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
