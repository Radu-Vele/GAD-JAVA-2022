package Lab4.ch4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //reading from file
        int input, height, width;
        try {
            FileReader fileReader = new FileReader("C:\\Self_Work\\Java_Google\\Projects\\GAD-JAVA-2022\\src\\Lab4\\ch4\\input.txt");
            Scanner scanner = new Scanner(new BufferedReader(fileReader)); //uses tokens

            String[] inputString = new String[3];

            if(scanner.hasNextInt()) {
                input = scanner.nextInt();
            }
            else {
                throw new IncorrectInputFormatException();
            }
            if(scanner.hasNextInt()) {
                height = scanner.nextInt();
            }
            else {
                throw new IncorrectInputFormatException();
            }
            if(scanner.hasNextInt()) {
                width = scanner.nextInt();
            }
            else {
                throw new IncorrectInputFormatException();
            }

            DigitsToLCD digitsToLCD = new DigitsToLCD(width, height);
            digitsToLCD.buildRepresentation(input);
            digitsToLCD.display("C:\\Self_Work\\Java_Google\\Projects\\GAD-JAVA-2022\\src\\Lab4\\ch4\\output.txt");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
