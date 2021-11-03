package by.overone.lesson21;

import by.overone.lesson20.Lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> list = new HashSet<>();
        Person gleb = new Person("Gleb", 1);
        Person boris = new Person("Boris", 2);
        Person maksim = new Person("Maksim", 3);
        Person olga = new Person("Olga", 4);
        Person lana = new Person("Lana", 5);
        list.add(gleb);
        list.add(boris);
        list.add(maksim);
        list.add(olga);
        list.add(lana);
        for (Person person : list) {
            System.out.println(person);
        }
        list.remove(gleb);
        list.remove(maksim);
        list.remove(olga);
        System.out.println("New list: ");
        for (Person person : list) {
            System.out.println(person);
        }


    }


}
