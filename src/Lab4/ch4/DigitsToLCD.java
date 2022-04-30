package Lab4.ch4;

import java.io.FileWriter;
import java.io.IOException;

public class DigitsToLCD {
    private int width;
    private int height;
    private char[][][] representation;

    public DigitsToLCD(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void buildRepresentation(int number) {
        char[] charArray = Integer.toString(number).toCharArray();
        Digit digit = new Digit(height, width);
        this.representation = new char[charArray.length][height][width + 2];
        for(int i = 0; i < charArray.length; i++) {
            digit.createRepresentation(charArray[i]);
            this.representation[i] = digit.getRepresentation();
        }
    }

    public void displayRow(int rowNr, FileWriter fileWriter) throws Exception{
        for(int i = 0; i < this.representation.length; i++) {
            for(int j = 0; j < width + 2; j++) {
                fileWriter.write(this.representation[i][rowNr][j]);
                System.out.print(this.representation[i][rowNr][j]);
            }
        }
    }

    public void display(String outputPath) {
        try(FileWriter fileWriter = new FileWriter(outputPath)){
            //print row by row;
            for (int i = 0; i < height; i++) {
                displayRow(i, fileWriter);
                fileWriter.write("\n");
                System.out.print("\n");
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }
}