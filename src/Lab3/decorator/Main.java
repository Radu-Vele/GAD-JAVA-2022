package Lab3.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        BeverageTopping milk = new Milk(coffee);
        Beverage sugar = new Sugar(milk);

        System.out.println(sugar.getCost());
        System.out.println(sugar.getDescription());

        Chocolate chocolate = new Chocolate();
        Whip whip = new Whip(chocolate);
        Sugar sugar1 = new Sugar(whip);
        Milk milk1 = new Milk(sugar1);

        System.out.println(milk1.getCost());
        System.out.println(milk1.getDescription());
    }
}
