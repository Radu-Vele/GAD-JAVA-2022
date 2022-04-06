package Lab3.visitor;

public class Main {
    public static void main(String[] args) {
        Element elements[] = new Element[3];
        elements[0] = new Book(30, "1984");
        elements[1] = new Song(3);
        elements[2] = new Movie(180);

        TimeVisitor v = new TimeVisitor();
        for (Element e : elements) {
            e.accept(v);
        }

        System.out.println(v.getTotalTime());

        //Could add other visitors too, e.g. DescriptionVisitor
        //
    }
}
