package Lab6.ex1;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void ex1() {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(10);
        list.add(12);

        Iterator<Integer> iterator = list.iterator(); //generic added
        Integer current;
        while (iterator.hasNext()) {
            current = iterator.next();
            System.out.println(current);
            if(current.equals(2))
                list.remove(2);
        }

    }
    public static void main(String[] args) {
        ex1();
    }
}
