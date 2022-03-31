package Lab1.ch3;

public class Main {
    public static int findNrPairs(int[] arr) {
        int nrPairs = 0;
        Boolean[] validator = new Boolean[arr.length];
        for(int i = 0; i < validator.length; i++) {
            validator[i] = true;
        }
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0) {
                    if(validator[i] && validator[j]) {
                        nrPairs++;
                        validator[i] = false;
                        validator[j] = false;
                    }
                }
            }
        }
        return nrPairs;
    }

    public static void main(String[] args) {
        int[] a = {2, -3, 1, -2, 3, 9, -9, 3, 6 , -2, -1};
        System.out.println(findNrPairs(a));
    }
}
