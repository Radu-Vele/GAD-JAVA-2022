package Lab5.ch1;

public abstract class Currency {
    private double value;
    private int ID;

    public Currency(Double value, Integer id) {
        this.ID = id;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
