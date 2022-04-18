package Lab3.ch2;

import java.util.Arrays;

/**
 * Sorting Strategy in O(n*log(n)) using "divide et impera"
 */
public class MergeSort implements SortingStrategy{
    @Override
    public void sort(Integer[] list) {
        mergeSort(list, 0, list.length - 1);
    }

    public void mergeSort(Integer[] arr, int left, int right) {

        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public void merge(Integer[] arr, int left, int mid, int right) {
        int size1 = mid - left + 1;
        int size2 = right - mid;
        Integer[] leftArr = new Integer[size1];
        Integer[] rightArr = new Integer[size2];

        for(int i = 0; i < size1; i++) {
            leftArr[i] = arr[left +  i];
        }

        for(int i = 0; i < size2; i++) {
            rightArr[i] = arr[mid + i +  1];
        }

        int index1, index2, mainIndex;
        index1 = 0;
        index2 = 0;
        mainIndex = left;

        while (index1 < size1 && index2 < size2) {
            if (leftArr[index1] <= rightArr[index2]) {
                arr[mainIndex] = leftArr[index1];
                index1++;
            }
            else {
                arr[mainIndex] = rightArr[index2];
                index2++;
            }
            mainIndex++;
        }

        while (index1 < size1) {
            arr[mainIndex] = leftArr[index1];
            mainIndex++;
            index1++;
        }

        while (index2 < size2) {
            arr[mainIndex] = rightArr[index2];
            mainIndex++;
            index2++;
        }
    }
}
