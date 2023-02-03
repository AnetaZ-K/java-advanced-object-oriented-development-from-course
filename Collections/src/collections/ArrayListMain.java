package pl.sda.collections;


import pl.sda.compare.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(100);

        System.out.println(arrayList.isEmpty());

        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(65);
        arrayList.add(76);
        arrayList.add(65);

        System.out.println(arrayList.size());

        System.out.println(arrayList.get(3));

        System.out.println(arrayList.contains(76));
        System.out.println(arrayList.contains(760));

        //System.out.println(arrayList.get(6)); //IndexOutOfBoundsException: Index 6 out of bounds for length 5

        arrayList.remove(Integer.valueOf(65)); //usuń pierwszy napotkany element o wartości 65
        arrayList.remove(0);//usuń element o indeksie 0

        System.out.println("Size after remove: " + arrayList.size());
        System.out.println(arrayList.get(2));

        arrayList.add(0, 97);

        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }

        System.out.println();//znak nowej linii
        //********************************************************

        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }



    }

}
