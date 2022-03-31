package Lab1.ch4;

public class Main {
    public static int find3Pairs(int[] arr) {
        int nrPairs = 0;
        Boolean[] validator = new Boolean[arr.length];
        for(int i = 0; i < validator.length; i++) {
            validator[i] = true;
        }

        for(int i = 0; i < arr.length - 2; i++) {
            for(int j = i; j < arr.length - 1; j++) {
                for(int k = j; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        if(validator[i] && validator[j] && validator[k]) {
                            nrPairs++;
                            validator[i] = false;
                            validator[j] = false;
                            validator[k] = false;
                        }
                    }
                }
            }
        }
        return nrPairs;
    }
    public static void main(String[] args) {
        int[] arr = {1, -1, -1, 2, 0, 1, -1, 1};
        System.out.println(find3Pairs(arr));
    }
}
