package Lab4.ch3;

public class Main {
    public static void main(String[] args) {
        AnagramGenerator anagramGenerator = new AnagramGenerator("listen");
        anagramGenerator.generate("src/Lab4/ch3/output.txt");
    }
}
