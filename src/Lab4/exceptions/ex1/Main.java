package Lab4.exceptions.ex1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int res = c.calculateResult(3);
        System.out.println("result = " + res); //even if exception was thrown this line is executed (as we handled it)
    }
}
