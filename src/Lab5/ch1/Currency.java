package Lab5.Ch1;

public abstract class Currency {
    private int value;

    public Currency(Integer value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
