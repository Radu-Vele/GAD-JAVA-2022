package Lab3.factory;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        switch ( type ) {
            case "Cheese" : return new NYStyleCheesePizza();
            case "Pepperoni": return new NYStylePepperoniPizza();
            default : return null;
        }
    }
}
