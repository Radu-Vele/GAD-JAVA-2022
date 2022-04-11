package Lab3.factory;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "Cheese":
                return new ChicagoStyleCheesePizza();
            case "Pepperoni":
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
    }
}
