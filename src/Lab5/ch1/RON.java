package Lab5.ch1;

public class RON extends Currency{
    public RON(Double value) {
        super(value, 1);
    }

    @Override
    public String toString() {
        return "RON " + getValue();
    }
}
