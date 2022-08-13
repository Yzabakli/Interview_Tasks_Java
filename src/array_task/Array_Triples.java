package array_task;

public class Array_Triples {
    public static void main(String[] args) {

        System.out.println(noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));

    }

    private static boolean noTriples(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[i + 1] && array[i] == array[i + 2]) {
                return false;
            }
        }
        return true;
    }
}
