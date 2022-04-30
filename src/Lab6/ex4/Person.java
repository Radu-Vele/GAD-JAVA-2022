package Lab6.ex4;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Person))
            return false;

        Person p = (Person) o;
        return p.name.equals(((Person) o).name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ion");
        Student s1 = new Student("U1", "Ion");
        Object o = new Object();

        System.out.println(p1.equals(s1));
        System.out.println(s1.equals(p1));
    }
}
