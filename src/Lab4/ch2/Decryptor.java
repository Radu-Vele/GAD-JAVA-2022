package Lab4.ch2;

import java.io.*;
import java.util.Scanner;

public class Decryptor {
    private String inputFileName;
    public Decryptor(String inputFileName) {
        this.inputFileName = inputFileName;
    }

    public String decrypt() {
        String toReturn = "";
        try {
            FileReader fileReader = new FileReader(inputFileName);
            int c;
            while((c = fileReader.read()) != -1) {
                if(Character.toString((char) c).equals("X")) {
                    toReturn += " ";
                }
                else if(Character.isUpperCase((char) c)) {
                    toReturn += Character.toString(c);
                }
            }

        } catch(IOException e) {
            e.printStackTrace();
        }

        return toReturn;
    }
}
