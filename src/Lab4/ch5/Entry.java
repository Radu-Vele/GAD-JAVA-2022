package Lab4.ch5;

/**
 * A tuple word-occurrences
 */
public class Entry implements Comparable{
    int occurrences;
    String word;

    public Entry(String word) {
        this.occurrences = 1;
        this.word = word;
    }

    public int getOccurrences() {
        return occurrences;
    }

    public void increment() {
        occurrences++;
    }

    @Override
    public int compareTo(Object o) {
        Entry other = (Entry) o;
        return other.getOccurrences() - this.occurrences;
    }

    @Override
    public String toString() {
        return "Word {" +
                "occurrences=" + occurrences +
                ", value='" + word + '\'' +
                '}';
    }
}
