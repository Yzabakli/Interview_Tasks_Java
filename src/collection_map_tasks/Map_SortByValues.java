package collection_map_tasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_SortByValues {
    public static void main(String[] args) {

        System.out.println(sortByValue(new HashMap<>(Map.of("name", 4, "age", 3, "gender", 2, "car", 1))));

    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> map) {

        TreeMap<Integer, String> map1 = new TreeMap<>();

        map.forEach((k, v) -> map1.put(v, k));

        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();

        map1.forEach((k, v) -> map2.put(v, k));

        return map2;
    }
}
