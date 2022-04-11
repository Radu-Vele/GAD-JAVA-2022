package Lab4.exceptions.ex1;

public class FatalException extends RuntimeException{
    public FatalException() {
        super("There is no way from here!");
    }
}
