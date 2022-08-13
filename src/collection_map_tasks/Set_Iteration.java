package collection_map_tasks;

import java.util.Iterator;
import java.util.Set;

public class Set_Iteration {
    public static void main(String[] args) {

        iteration3(Set.<Object>of("1", "2", "3", "val1", "val2", "val3"));

    }
    private static void iteration(Set<Object> set){

        set.forEach(System.out::println);
    }
    private static void iteration2(Set<Object> set){

        for (Object each : set) {

            System.out.println(each);
        }
    }
    private static void iteration3(Set<Object> set){

        for (Iterator<Object> i = set.iterator(); i.hasNext();) {

            System.out.println(i.next());
        }
    }
}
