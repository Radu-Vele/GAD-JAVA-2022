package Lab2;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("John", 100, 20);
        Fighter fighter2 = new Fighter("Max", 100, 30);
        BoxingMatch match = new BoxingMatch(fighter1, fighter2);

        System.out.println(match.fight());
    }
}
