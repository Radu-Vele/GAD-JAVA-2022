package Lab5.ch4;

import Lab5.ch3.GenericList;
import Lab5.ch3.GenericNode;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1, 2, 3};
        IArrayIterator<Integer> it = new ArrayIterator<>(arr);
        while (it.hasNext()){
            System.out.println(it.next());
        }

        GenericList<Integer> genericList = new GenericList<>(99);
        genericList.insert(98);
        genericList.insert(97);
        IArrayIterator<Integer> it1 = new ArrayIterator<Integer>(genericList);

        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}
