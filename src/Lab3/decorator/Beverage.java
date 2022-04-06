package Lab3.decorator;

public abstract class Beverage {
    private int cost;
    private String description;

    public Beverage(int cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    int getCost() {
        return cost;
    }

    String getDescription() {
        return description;
    }

}
