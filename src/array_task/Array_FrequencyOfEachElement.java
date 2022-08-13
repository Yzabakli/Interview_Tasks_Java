package array_task;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Array_FrequencyOfEachElement {
    public static void main(String[] args) {

        TreeMap[] testArray = {new TreeMap<>(Map.of(1, 2, 3, 4)), new TreeMap<>(Map.of(1, 2, 4, 4)),
                new TreeMap<>(Map.of(1, 2, 3, 4)), new TreeMap<>(Map.of(1, 2, 3, 5))};

        frequencyOfEachElement(testArray);

    }

    private static void frequencyOfEachMethod(String[] array) {

        String result = "";

        for (int i = 0; i < array.length; i++) {

            if (result.contains(array[i])) {
                continue;
            }

            int frequency = 1;

            for (int j = i + 1; j < array.length; j++) {

                if (array[i].equals(array[j]) && !result.contains(array[i])) {

                    frequency++;

                }
            }

            result += array[i] + " = " + frequency + "\n";
        }

        System.out.println(result);
    }

    private static void frequencyOfEachMethod(Boolean[] array) {

        int isTrue = 0, isFalse = 0;

        for (Boolean aBoolean : array) {
            if (aBoolean) {
                isTrue++;
            } else isFalse++;
        }

        System.out.println(true + " = " + isTrue + "\n" + false + " = " + isFalse);
    }

    private static void frequencyOfEachElement(Iterable<Object>[] array) {

        Map<Object, Integer> frequencyMap = frequencyOfEachMethod(array);

        System.out.println(frequencyMap.toString().replaceAll("=", " = ").replaceAll(", \\[",
                "\n[").replace("{", "").replace("}", ""));
    }

    private static void frequencyOfEachElement(Object[] array) {

        Map<Object, Integer> frequencyMap = frequencyOfEachMethod(array);

        System.out.println(frequencyMap.toString().replace("{", "").replace("}", "")
                .replaceAll(",", "\n").replaceAll(" ", "").replaceAll("=", " = "));
    }

    private static void frequencyOfEachElement(Map[] array) {

        Map<Object, Integer> frequencyMap = frequencyOfEachMethod(array);

        String s = frequencyMap.toString().replaceAll("=", " = ").replaceAll(", \\{",
                "\n{");
        System.out.println(s.replace("{{", "{").substring(0, s.replace("{{", "{").length() - 1));
    }

    private static Map<Object, Integer> frequencyOfEachMethod(Object[] array) {
        Map<Object, Integer> frequencyMap = new LinkedHashMap<>();

        for (int i = 0; i < array.length; i++) {

            if (frequencyMap.containsKey(array[i])) {
                continue;
            }

            int frequency = 1;

            for (int j = i + 1; j < array.length; j++) {

                if (array[i].equals(array[j])) {

                    frequency++;

                }
            }

            frequencyMap.put(array[i], frequency);
        }

        return frequencyMap;
    }
}
