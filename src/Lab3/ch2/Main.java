package Lab3.ch2;

import java.util.Arrays;

/**
 * Strategy Design pattern -> encapsulate a family of algorithms that is encapsulated in Strategy Interface
 */

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubbleSort(), copy01OfArr);
        displaySorted(new MergeSort(), copy02OfArr);
    }

    public static void displaySorted(SortingStrategy strategy, Integer[] arr) {
        strategy.sort(arr);
        System.out.println(strategy.getClass().getSimpleName() + " : ");
        for (Integer integer : arr) {
            System.out.printf("%d ", integer);
        }
        System.out.println();
    }

}
