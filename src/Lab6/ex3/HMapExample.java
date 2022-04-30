package Lab6.ex3;

import java.util.HashMap;
import java.util.Map;

public class HMapExample {
    public static void main(String[] args) {
        Map<Long, String> people = new HashMap<>();
        people.put(12323455L, "Alex Iftimie");
        people.put(12323423L, "Alex Popescu");
        people.put(12323425L, "Ion Popescu");

        System.out.println(people.get(12323455L));

        //traversal
        for(Map.Entry person : people.entrySet()) {
            System.out.println(person);
        }
    }
}
