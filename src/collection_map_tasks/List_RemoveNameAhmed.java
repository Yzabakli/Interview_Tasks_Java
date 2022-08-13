package collection_map_tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_RemoveNameAhmed {
    public static void main(String[] args) {

        ArrayList<String> stack = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {

            stack.addAll(List.of("Ahmed", "John", "Eric", "Ahmed"));
        }

        long start = System.currentTimeMillis();
        removeNameAhmed2(stack);
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);

    }

    private static List<String> removeNameAhmed2(ArrayList<String> list){

        list.removeAll(List.of("Ahmed"));

        return list;
    }
/*
    stack [100000] 21   stack [1000000] 40
    vector   "     19   vector   "      37
    linked   "     21   linked   "      63
    arrayL   "     11   arrayL   "      29  arrayL [10000000]  227
 */
    private static List<String> removeNameAhmed3(LinkedList<String> names) {
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Ahmed"))
                it.remove();
        }
        return names;
    }
/*
    stack [100000] 3189 stack [1000000] Exceed Time Limit
    vector   "     3202 vector   "     Exceed Time Limit
    linked   "     19   linked   "     54                      linked [10000000]  465
    arrayL   "     3177 arrayL   "     Exceed Time Limit
 */
    private static List<String> removeNameAhmed(List<String> names) {
        names.removeIf(name -> name.equals("Ahmed"));
        return names;
    }
/*
    stack [100000] 15   stack [1000000] 32 stack [10000000] 169
    vector   "     15   vector   "      31 vector   "       174
    linked   "     21   linked   "      57 linked   "       461
    arrayL   "     20   arrayL   "      31 arrayL   "       215
 */
}
