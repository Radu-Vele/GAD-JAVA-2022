package Lab2.ch3;

public class Fish extends Animal implements Pet{
    public Fish() {
        super(0);
    }

    @Override
    protected void toEat() {

    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk, bro");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void play() {
        System.out.println("Happy fish");
    }
}
