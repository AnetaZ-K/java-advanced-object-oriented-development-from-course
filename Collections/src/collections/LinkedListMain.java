package pl.sda.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

    public static void main(String[] args) {

        /*LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(23);
        linkedList.add(34);

        linkedList.add(0, 45);
        System.out.println(linkedList.get(2));
        linkedList.remove(Integer.valueOf(23));//usuń element o wartości 23
        linkedList.remove(1);//usuń element o indeksie 1
        System.out.println(linkedList.contains(34));

        for (Integer i : linkedList) {
            System.out.print(i + " ");
        }*/

        System.out.println();//pusta linia
        //*******************************************************
        LinkedList<Integer> queueList = new LinkedList<>();
        //Metody do traktowania LinkedList jako kolejkę FIFO
        queueList.addFirst(10);//wstaw jako head
        queueList.addLast(120);//wstaw jako ogon

        for (Integer i : queueList) {
            System.out.print(i + " ");
        }

        System.out.println();//pusta linia

        System.out.println(queueList.poll());//zwraca i jednocześnie usuwa głowę - 10
        System.out.println(queueList.peek());//zwraca, ale NIE usuwa głowy - 120
        System.out.println(queueList.pollLast());//zwraca i jednocześnie usuwa ogon - 120
        System.out.println(queueList.peekLast());//zwraca, ale NIE usuwa ogona - null

    }

}
