package Lab5.ch5;

public class ArrayNotSortedException extends Exception{
    @Override
    public String getMessage() {
        return "The array is not sorted";
    }
}
