/*
* FizzBuzz challenge  */

package Lab1.ch1;

public class Main {
    public static void main(String[] args) { //could add command line arguments
        //could add a scanner class to get n
        for(int i = 1; i <= 100; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            else if(i % 5 == 0) {
                System.out.print("Buzz");
            }
            else if(i % 7 == 0) {
                System.out.print("Rizz");
            }
            else if(i % 11 == 0) {
                System.out.print("Jazz");
            }
            else {
                System.out.print(i);
            }

            if(i != 100) {
                System.out.printf(", ");
            }
        }
    }
}
