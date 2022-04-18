package Lab3.ch5;

import java.util.Arrays;

/**
 * Template Method Design Pattern used: - describe the skeleton of the algorithm in an operation while the
 * subclasses add their own particularizations
 */
public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        AscBubbleSort ascBubbleSort = new AscBubbleSort();
        ascBubbleSort.sort(copy01OfArr);

        DescBubbleSort descBubbleSort = new DescBubbleSort();
        descBubbleSort.sort(copy02OfArr);

        displaySorted(copy01OfArr);
        displaySorted(copy02OfArr);
    }

    public static void displaySorted(Integer[] arr) {
        for(Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
