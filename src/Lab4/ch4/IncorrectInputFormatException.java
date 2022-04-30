package Lab4.ch4;

public class IncorrectInputFormatException extends Exception{
    @Override
    public String getMessage() {
        return "\nCareful! The file has an incorrect format!\n";
    }
}
