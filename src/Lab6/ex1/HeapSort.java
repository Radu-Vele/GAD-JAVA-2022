package Lab6.ex1;

import java.util.*;

public class HeapSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 5, 7, 8, 3, 4));
        System.out.println(heapSort(list));
    }

    public static <E> List<E> heapSort(Collection<E> c) {
        Queue<E> queue = new PriorityQueue<>(c);
        List<E> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.remove());
        }
        return result;
    }
}
