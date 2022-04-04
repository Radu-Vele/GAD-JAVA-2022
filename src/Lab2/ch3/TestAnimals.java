package Lab2.ch3;

import java.lang.invoke.SwitchPoint;

public class TestAnimals {
    public static void main(String[] args) {

        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        Spider n = new Spider();

        //experiment
        d.walk();
        e.toEat();
        c.play();
        c.toEat();
        p.play();
        p.setName("Joshua");
        p.play();
        p = (Fish) a; //can cast a cat to a fish ish
        p.play();
        p.setName("Bob");
        System.out.println(p.getName());
        c.walk();
        n.niceWalk();
    }
}
