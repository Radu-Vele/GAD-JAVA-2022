package Lab3.ch5;

public class DescBubbleSort extends TemplateMethodBubbleSort{
    @Override
    boolean numbersInCorrectOrder(Integer integer1, Integer integer2) {
        return (integer1 > integer2);
    }
}
