package Lab3.ch1;

public class ArrayCustomIterator implements Iterator{

    private int[] arr;
    private int position;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
//        position = 0; //the position is automatically initialized with 0
    }

    public boolean hasNext() {
        return (position < arr.length);
    }

    public int next() {
        return arr[position++];
    }
}
