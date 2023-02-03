package pl.sda.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>(); //nie pozwala na przechowywanie duplikatów

        hashSet.add(12);
        hashSet.add(34);
        hashSet.add(456);
        hashSet.add(65);
        hashSet.add(23);
        System.out.println(hashSet.add(23)); //false, ponieważ liczba 23 już istnieje

        System.out.println(hashSet.size()); //5 ponieważ liczba 23 dodała się tylko jeden raz

        for (Integer i : hashSet) {
            System.out.print(i + " ");
        }

        System.out.println(hashSet.contains(23));


    }

}
