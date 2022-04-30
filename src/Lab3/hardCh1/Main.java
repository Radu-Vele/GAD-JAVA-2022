package Lab3.hardCh1;

/**
 * Use the Decorator design pattern to create the christmas tree
 */

public class Main {
    public static void main(String[] args) {
        DecorableTree christmasTree = new ChristmasTree();
        DecorableTree decoratedTree = new Garland(new Bulbs( new Candy(christmasTree)));
        decoratedTree.display();
        christmasTree.display();
    }
}
