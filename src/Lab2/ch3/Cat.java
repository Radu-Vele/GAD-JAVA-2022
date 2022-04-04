package Lab2.ch3;

public class Cat extends Animal implements Pet{

    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    public void play() {
        System.out.println("Play with the cat named " + this.name);
    }

    @Override
    protected void toEat() {
        System.out.println("Cat named " + this.name + " eats mice");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
