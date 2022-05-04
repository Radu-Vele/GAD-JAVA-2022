package Lab5.ch5;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 6, 7, 9};
        String[] array1 = new String[]{"A", "B", "C", "D", "E"};
        BinarySearcher<Integer> binarySearcher = new BinarySearcher<>(array);
        BinarySearcher<String> binarySearcher1 = new BinarySearcher<>(array1);
        try {
            Integer found = binarySearcher.search(1);
            String found1 = binarySearcher1.search("C");
            System.out.println("Found element:" + found);
            System.out.println("Found element:" + found1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
