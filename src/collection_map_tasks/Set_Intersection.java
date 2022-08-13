package collection_map_tasks;

import java.util.Set;

public class Set_Intersection {
    public static void main(String[] args) {



    }

    private static Set<Object> getIntersection(Set<Object> a, Set<Object> b) {

        if (a.size() > b.size()) {
            a.retainAll(b);
            return a;
        } else {
            b.retainAll(a);
            return b;
        }
    }
}
