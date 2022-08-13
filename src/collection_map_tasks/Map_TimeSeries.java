package collection_map_tasks;

import java.util.HashMap;
import java.util.Map;

public class Map_TimeSeries {
    public static void main(String[] args) {

        System.out.println(timeSeries(Map.of(1, 1.0, 2, 1.5, 3, 2.5), Map.of(2, 1.0, 3, 2.5, 5, 1.0)));

    }

    private static Map<Integer, Double> timeSeries(Map<Integer, Double> map1, Map<Integer, Double> map2) {

        HashMap<Integer, Double> map = new HashMap<>(map1);

        for (Integer number : map2.keySet()) {

            if (map.containsKey(number)){

                map.replace(number, map.get(number) + map2.get(number));
            }
            map.putIfAbsent(number, map2.get(number));
        }
        return map;
    }
}
