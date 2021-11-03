package by.overone.lesson21;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Karina Narbutovich
 */
public class Counter {
    public <Integer> Counter() {
    }


    public int countUnique(ArrayList<Integer> list) {
        boolean empty = list.isEmpty();
        if (empty == true) {
            System.out.println("0");
            return 0;
        } else {
            HashSet<Integer> hashSet = new HashSet<>();
            for (Integer num : list) {
                hashSet.add(num);
            }
            int count = hashSet.size();
            System.out.println("Count of unique numbers: " + count);
            return count;
        }
    }
}
