package Lab2.ch3;

public abstract class Animal {
    protected int legs;

    protected Animal() {

    }

    protected Animal(int legs) {
        this.legs = legs;
    }

    protected abstract void toEat();

    public void walk() {
        System.out.println("The animal walks gracefully on " + legs + " legs");
    }
}
