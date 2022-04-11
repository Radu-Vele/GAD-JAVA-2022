package Lab3.factory;

/**
 * Want to make an abstract pizza place that could be reused by specific Pizza Stores with their own products.
 */

public abstract class PizzaStore {
    public Pizza orderPizza(String type) { //common for any concrete pizza place
        Pizza pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type); //this is our aim --> Factory Pattern
}
