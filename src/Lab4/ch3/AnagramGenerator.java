package Lab4.ch3;

public class AnagramGenerator {
    String inputString;
    String outputFileName;

    public AnagramGenerator(String inputString) {
        this.inputString = inputString;
    }

    /**
     * Generator of all the unique anagrams (permutations) of a string.
     * Use backtracking.
     * @param outputFileName
     */
    public void generate(String outputFileName) {

        this.outputFileName = outputFileName;
    }
}
