package Lab5.Ch1;

public class Main {
    public static void main(String[] args) {
        ExchangeDesk<USD, RON> exchangeDesk = new ExchangeDesk<USD, RON>();
        USD usd = new USD(10);
        try {
            RON ron = exchangeDesk.convert(usd, RON.class);
            System.out.println(ron);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
