package Lab2.ch3;

public class Spider extends Animal{

    public Spider() {
        super(8); //8 legs by default
    }

    @Override
    protected void toEat() {
        System.out.println("The spider eats flies");
    }

    public void niceWalk() {
        super.walk();
        System.out.println("    That is indeed a complicated way of walking");
    }
}
