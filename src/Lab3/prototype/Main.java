package Lab3.prototype;

public class Main {
    public static void main(String[] args) {
        Leash leash = new Leash("red", 3);
        Dog dog = new Dog("Bobby", leash);
        try {
            System.out.println(dog);
            Dog dog2 = dog.clone();
            dog2.getLeash().setColor("blue"); //we deal with a shallow copy (the clone doesn't create a new Leash object);
                                              // => solve by creating a new clone in the overriden method => DEEP copy
            dog.setAge(20);
            System.out.println(dog);
            System.out.println(dog2);
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
