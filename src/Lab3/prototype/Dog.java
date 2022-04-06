package Lab3.prototype;

public class Dog implements Cloneable{
    private String name;
    private int age;
    private Leash leash;

    public Dog(String name, Leash leash) {
        this.name = name;
        this.leash = leash;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Dog clone() throws CloneNotSupportedException{
        Dog dog = (Dog)super.clone();
        dog.leash = this.leash.clone();
        return dog;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", leash=" + leash +
                '}';
    }

    public Leash getLeash() {
        return leash;
    }
}
