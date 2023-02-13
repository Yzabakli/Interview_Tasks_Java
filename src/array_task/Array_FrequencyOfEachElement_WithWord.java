package array_task;

import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Array_FrequencyOfEachElement_WithWord {
    public static void main(String[] args) {

        frequencyOfEachMethod3(new int[]{5, 5, 1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4, 5, 2, 2, 2, 2, 2, 2, 2, 2});
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

    private static void frequencyOfEachMethod2(int[] array) {

        Map<Object, String> frequencyMap = new HashMap<>();

        String[] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "More than ten"};

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

            try {

                frequencyMap.put(array[i], words[frequency - 1]);
            }catch (ArrayIndexOutOfBoundsException e){
                frequencyMap.put(array[i], words[words.length - 1]);
            }
        }

        frequencyMap.entrySet().forEach(objectStringEntry -> {
            if (objectStringEntry.getValue().equals("One")) {
                System.out.println(objectStringEntry.toString().replace("=", " is ").toLowerCase() + " time");
            } else {
                System.out.println(objectStringEntry.toString().replace("=", " is ").toLowerCase() + " times");
            }
        });
    }

    private static void frequencyOfEachMethod3(int[] array) {

        Map<Object, String> frequencyMap = new HashMap<>();

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
            if (frequency < 10) {
                String name = Character.getName(frequency + 48);
                frequencyMap.put(array[i], name.substring(name.indexOf(" ") + 1));
            } else if (frequency == 10) {
                frequencyMap.put(array[i], "ten");
            }else frequencyMap.put(array[i], "more then ten");
        }

        frequencyMap.entrySet().forEach(objectStringEntry -> {
            if (objectStringEntry.getValue().equals("One")) {
                System.out.println(objectStringEntry.toString().replace("=", " is ").toLowerCase() + " time");
            }else {
                System.out.println(objectStringEntry.toString().replace("=", " is ").toLowerCase() + " times");
            }
        });
    }
}
