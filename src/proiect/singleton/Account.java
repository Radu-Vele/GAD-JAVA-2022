package proiect.singleton;

import java.util.ArrayList;

public class Account {
    private Currency currency;
    private double sum;

    public Account(Currency currency, double sum) {
        this.currency = currency;
        this.sum = sum;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Account: " +
                "currency=" + currency +
                ", sum=" + sum;
    }
}
