package Lab4.ch2;

public class Main {
    public static void main(String[] args) {
        Decryptor decryptor = new Decryptor("src/Lab4/ch2/input.txt");
        String result = decryptor.decrypt();
        System.out.println(result);
    }
}
