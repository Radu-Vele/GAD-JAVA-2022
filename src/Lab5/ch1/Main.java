package Lab5.ch1;

public class Main {
    public static void main(String[] args) {
        ExchangeDesk<USD, RON> exchangeDesk = new ExchangeDesk<USD, RON>();
        ExchangeDesk<RON, USD> exchangeDesk1 = new ExchangeDesk<RON, USD>();
        USD usd = new USD(10.0);
        RON ron1 = new RON(22.0);
        try {
            exchangeDesk.addRate(USD.class, RON.class, 4.212d);
            exchangeDesk1.addRate(RON.class, USD.class, 0.25d);
            RON ron = exchangeDesk.convert(usd, RON.class);
            USD usd1 = exchangeDesk1.convert(ron1, USD.class);
            System.out.println(ron);
            System.out.println(usd1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
