package by.overone.lesson21;

import java.util.ArrayList;

/**
 * @author Karina Narbutovich
 */

public class TrainingGroup {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(7);
        Counter num = new Counter();
        num.countUnique(list);
        String text = "seddrd Advhkl l kokok-jiji kkk, l uhu, njnj. Dhjnjkm kkokok uhhuhh.";
        VariousWords first = new VariousWords(text);
        first.wordSeparator();


    }
}


