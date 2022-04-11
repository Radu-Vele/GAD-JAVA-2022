package Lab3.factory;

public class Main {
    public static void main(String[] args) {
        PizzaStore myPizzaStore = new NYPizzaStore();
        Pizza myCheesePizza = myPizzaStore.orderPizza("Pepperoni");
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("Cheese");
    }
}
