package Lab4.ch5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordProcessor {
    HashMap<Integer, Entry> hashMap;
    FileReader fileReader;
    public WordProcessor(String path) throws IOException {
        fileReader = new FileReader(path);
        hashMap = new HashMap<>();
    }

    public void scanFile() throws IOException{
        Scanner scanner = new Scanner(new BufferedReader(fileReader));
        while(scanner.hasNext()) {
            String currentWord = scanner.next();
            currentWord = currentWord.toLowerCase(Locale.ROOT);
            Integer key = currentWord.hashCode();
            if(hashMap.get(key) == null) {
                Entry entry = new Entry(currentWord);
                hashMap.put(key, entry);
            }
            else {
                Entry entry = hashMap.get(key);
                entry.increment();
            }
        }
        fileReader.close();
    }

    public void displayTop() {
        System.out.println("The top 10 words:");
        List<Entry> list = new ArrayList<>(hashMap.values());
        Collections.sort(list);
        int i = 0;
        for(Entry entry : list) {
            if(i > 9)
                break;
            i++;

            System.out.println(i + " : " + entry);
        }
    }
}
