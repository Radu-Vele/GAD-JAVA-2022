package Lab5.ch5;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearcher<T extends Comparable<T>> {
    T[] array;

    public BinarySearcher(T[] array) {
        this.array = array;
    }

    public T search(T element) throws ArrayNotSortedException, ElementNotFoundException{
            T[] array1, array2;
            if (this.array != null) {
                array1 = array.clone();
                array2 = array.clone();

                Arrays.sort(array1);
                Arrays.sort(array2, Collections.reverseOrder());

                if (!Arrays.equals(array, array1) && !Arrays.equals(array, array2)) {
                    throw new ArrayNotSortedException();
                }
                else if(Arrays.equals(array, array1))
                    return(binarySearch(0, array.length - 1, element, 0));
                else if(Arrays.equals(array, array2))
                    return(binarySearch(0, array.length - 1, element, 1));
            } else {
                throw new ArrayNotSortedException();
            }
        throw new ElementNotFoundException();
    }

    public T binarySearch(int left, int right, T searched, int direction) throws ElementNotFoundException {
        if(right >= left) {
            int middle = left + (right - left) / 2;

            if(array[middle] == searched) {
                return searched;
            }

            if(searched.compareTo(array[middle]) < 0) {
                if(direction == 0) {
                    return binarySearch(left, middle - 1, searched, 0);
                }

                return binarySearch(middle + 1, right, searched, 1);

            }

            if(direction == 0) {
                return binarySearch(middle + 1, right, searched, 0);
            }

            return binarySearch(left, middle - 1, searched, 1);
        }
        else {
            throw new ElementNotFoundException();
        }
    }
}
