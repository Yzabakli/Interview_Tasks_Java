package array_task;

import java.util.HashMap;
import java.util.Map;

public class Array_FrequencyOfEachElement_WithWord {
    public static void main(String[] args) {

        frequencyOfEachElementWithWord(new int[]{1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4});

    }

    private static void frequencyOfEachElementWithWord(int[] array) {

        Map<Object, String> frequencyMap = frequencyOfEachMethod(array);

        System.out.println(frequencyMap.toString()
                .replace("=", " is ")
                .replace(", ", "\n")
                .replace("{", "")
                .replace("}", ""));
    }

    private static Map<Object, String> frequencyOfEachMethod(int[] array) {

        Map<Object, String> frequencyMap = new HashMap<>();

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        for (int i = 0; i < array.length; i++) {

            if (frequencyMap.containsKey(array[i])) {
                continue;
            }

            int frequency = 1;

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {

                    frequency++;

                }
            }

            frequencyMap.put(array[i], words[frequency]);
        }

        return frequencyMap;
    }
}
