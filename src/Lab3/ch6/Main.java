package Lab3.ch6;

/**
 * Using the Builder Design Pattern: separate the construction process of a complex object from its representation
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder("Ion").setUniversity("UBB").build();
        System.out.println(person);
    }
}
