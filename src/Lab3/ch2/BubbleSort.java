package Lab3.ch2;

/**
 * Sorting strategy in O(n^2)
 */
public class BubbleSort implements SortingStrategy{
    @Override
    public void sort(Integer[] list) {
        int i, count;
        int iterationNumber = 0;

        do {
            count = 0;

            for(i = 0; i < list.length - 1 - iterationNumber; i++) {
                if(list[i] > list[i + 1]) {
                    int aux = list[i + 1];
                    list[i + 1] = list[i];
                    list[i] = aux;
                    count++;
                }
            }
            iterationNumber++;
        } while (count > 0);
    }
}
