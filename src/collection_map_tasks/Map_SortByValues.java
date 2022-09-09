package collection_map_tasks;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Map_SortByValues {
    public static void main(String[] args) {

        System.out.println(sortByValue2(new HashMap<>(Map.of("name", 4, "age", 3, "gender", 2, "car", 1))));

    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> map) {

        TreeMap<Integer, String> map1 = new TreeMap<>();

        map.forEach((k, v) -> map1.put(v, k));

        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();

        map1.forEach((k, v) -> map2.put(v, k));

        return map2;
    }

    private static Map<String, Integer> sortByValue2(Map<String, Integer> map) {

        Map<String, Integer> map1 = new LinkedHashMap<>();

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(stringIntegerEntry -> map1.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue()));

        return map1;
    }
}
