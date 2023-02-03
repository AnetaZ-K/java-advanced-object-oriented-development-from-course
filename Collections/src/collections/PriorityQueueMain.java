package pl.sda.collections;

import java.util.*;

public class PriorityQueueMain {

    public static void main(String[] args) {

//        PriorityQueue<String> priorityQueue = new PriorityQueue<>(10, new StringComparator()); //nie znaliśmy interfejsów funkcyjnych

//        PriorityQueue<String> priorityQueue = new PriorityQueue<>(10, (a, b) -> b.compareTo(a)); //wykorzystanie wyrażenie lambda

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(10, Comparator.reverseOrder()); //wykorzystanie gotowej metody statycznej realizującej sortowanie w kolejności malejącej

        priorityQueue.offer("Jan");
        priorityQueue.offer("Michał");
        priorityQueue.offer("Anna");
        priorityQueue.offer("Sylwia");
        priorityQueue.offer("Krzysztof");

        System.out.println(priorityQueue.peek()); // sprawdź początek kolejki - Sylwia
        System.out.println(priorityQueue.poll()); //sprawdź i usuń początek kolejki - Sylwia
        System.out.println(priorityQueue.peek());//// sprawdź początek kolejki - Michał

        for (String s : priorityQueue) {
            System.out.print(s + " ");
        }

        //*************************************************
        System.out.println();//nowa linia
        List<String> arrayList = new ArrayList<>(priorityQueue);
        Collections.sort(arrayList, new StringComparator());
        for (String s : arrayList) {
            System.out.print(s + " ");
        }


    }

    static class StringComparator implements Comparator<String> {

        @Override
        public int compare(String string1, String string2) {
            return string2.compareTo(string1); //Z-A
        }
    }

}
