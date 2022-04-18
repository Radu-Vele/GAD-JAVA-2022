package Lab3.ch3;

public class Apartment {
    private int monthlyRentCost;
    private String location;

    public Apartment(String location, int monthlyRentCost) {
        this.monthlyRentCost = monthlyRentCost;
        this.location = location;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }

    public void setMonthlyRentCost(int monthlyRentCost) {
        this.monthlyRentCost = monthlyRentCost;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "monthlyRentCost=" + monthlyRentCost +
                ", location='" + location + '\'' +
                '}';
    }
}
