package Lab3.ch1;

/**
 * Iterator design pattern -> allows iterating through a collection (or aggregate object) without exposing its representation
 */

public class Main {
    public static void main(String[] args) {
        int arr_inst[] = new int[] {1, 2, 3};
        ArrayCustomIterator arrayCustomIterator = new ArrayCustomIterator(arr_inst);
        while (arrayCustomIterator.hasNext()) {
            System.out.println(arrayCustomIterator.next());
        }
    }
}
