package pl.sda.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMain {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(34);
        treeSet.add(22);
        treeSet.add(12);
        treeSet.add(67);
        treeSet.add(-2);

        for (Integer i : treeSet) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (Integer i : treeSet.descendingSet()) { //zwraca zbiór posortowany od wartości największej do najmniejszej
            System.out.print(i + " ");
        }

        //*****************************************************
        System.out.println();

        SortedSet<Integer> tailSet = treeSet.tailSet(22, false);//zawiera elementy więszke i równe 22
        tailSet.add(100);

        for (Integer i : tailSet) {
            System.out.print(i + " ");
        }

        //*****************************************************
        System.out.println();

        SortedSet<Integer> headSet = treeSet.headSet(22, true);//zawiera elementy mniejsze i równe 22
        headSet.add(11);

        for (Integer i : headSet) {
            System.out.print(i + " ");
        }



        //*****************************************************
        System.out.println();

        SortedSet<Integer> subSet = treeSet.subSet(22, true, 67, true);//zawiera elementy od 22 włącznie do 67 wyłącznie

        for (Integer i : subSet) {
            System.out.print(i + " ");
        }
    }
}
