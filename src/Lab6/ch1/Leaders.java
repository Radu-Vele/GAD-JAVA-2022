package Lab6.ch1;

import java.util.*;

public class Leaders {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,4, 3, 2, 9, 7, 5, 2, 8));
        System.out.println(Leaders.findLeaders(list));
    }

    public static List<Integer> findLeaders(List<Integer> list){
        List<Integer> leaders = new ArrayList<>();
        Collections.reverse(list);
        Iterator<Integer> iterator = list.iterator();
        int current;
        int maxElem = list.get(0);
        leaders.add(maxElem);

        while (iterator.hasNext()) {
            current = iterator.next();

            if(current > maxElem) {
                leaders.add(current);
                maxElem = current;
            }
        }
        return leaders;
    }
}
