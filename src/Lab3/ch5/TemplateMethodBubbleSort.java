package Lab3.ch5;

public abstract class TemplateMethodBubbleSort {
    void sort(Integer[] list) {
        int count = 0;
        int iterationNr = 0;

        do {
            count = 0;

            for(int i = 0; i < list.length - iterationNr - 1; i++) {
                if(!numbersInCorrectOrder(list[i], list[i + 1])) {
                    int aux = list[i + 1];
                    list[i + 1] = list[i];
                    list[i] = aux;

                    count++;
                }
            }

            iterationNr++;

        } while(count > 0);
    }

    abstract boolean numbersInCorrectOrder(Integer integer1, Integer integer2);
}
