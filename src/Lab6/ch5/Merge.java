package Lab6.ch5;

import java.util.*;

public class Merge {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 5, 8, 9));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(2,4, 7, 9, 22));

        System.out.println(Merge.mergeSorted(l1, l2));
        //TODO: like grown ups
    }

    public static List<Integer> mergeSorted(List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);
        Collections.sort(list1);
        return list1;
    }
}
