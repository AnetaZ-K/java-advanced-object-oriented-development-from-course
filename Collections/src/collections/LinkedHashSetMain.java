package pl.sda.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMain {

    public static void main(String[] args) {

        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(12);
        linkedHashSet.add(34);
        linkedHashSet.add(456);
        linkedHashSet.add(65);
        linkedHashSet.add(23);
        System.out.println(linkedHashSet.add(23)); //false, ponieważ liczba 23 już istnieje

        System.out.println(linkedHashSet.size()); //5 ponieważ liczba 23 dodała się tylko jeden raz

        for (Integer i : linkedHashSet) {
            System.out.print(i + " ");
        }

        System.out.println(linkedHashSet.contains(23));

    }

}
