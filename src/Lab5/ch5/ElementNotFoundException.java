package Lab5.ch5;

public class ElementNotFoundException extends Exception{
    @Override
    public String getMessage() {
        return("The searched element was not found");
    }
}
