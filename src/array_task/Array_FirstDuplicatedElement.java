package array_task;

public class Array_FirstDuplicatedElement {
    public static void main(String[] args) {

        Integer[] arr = new Integer[100000000];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = i + 1;
        }

        arr[arr.length - 1] = arr.length - 2;

        long start = System.currentTimeMillis();

        System.out.println(firstDuplicatedElement(arr));

        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);

    }

    private static Object firstDuplicatedElement(Object[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i].equals(array[j])) {
                    return array[i];
                }
            }
        }

        return "all elements are unique";
    }
}
