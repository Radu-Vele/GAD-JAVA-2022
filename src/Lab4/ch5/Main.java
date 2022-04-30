package Lab4.ch5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            WordProcessor wordProcessor = new WordProcessor("C:\\Self_Work\\Java_Google\\Projects\\GAD-JAVA-2022\\src\\Lab4\\ch5\\input.txt");
            wordProcessor.scanFile();
            wordProcessor.displayTop();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
