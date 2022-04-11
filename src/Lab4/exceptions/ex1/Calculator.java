package Lab4.exceptions.ex1;

public class Calculator {
    private int intermediateOperation(int i) throws WrongInputException{
        if(i % 2 == 0) {
            throw new WrongInputException(i);
        }
        if(i == 5) {
            throw new FatalException();
        }
        return i * 3;
    }
    public int calculateResult(int param) {
        int result = 0;
        try {
            result = intermediateOperation(param);
        } catch (WrongInputException e) {
            e.printStackTrace();
        }
        return result;
    }
}
