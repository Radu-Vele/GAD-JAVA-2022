package Lab5.ch1;

public class USD extends Currency{
    public USD(Double value) {
        super(value, 0);
    }

    @Override
    public String toString() {
        return "USD " + getValue();
    }
}
