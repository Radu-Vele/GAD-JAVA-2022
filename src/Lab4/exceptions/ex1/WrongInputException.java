package Lab4.exceptions.ex1;

public class WrongInputException extends Exception{
    public WrongInputException(int i) {
        super("The input value is not supportrd: " + i);
    }
}
