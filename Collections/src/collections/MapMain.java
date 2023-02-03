package pl.sda.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        Map<Integer, String> days = new HashMap<>();
        days.put(1, "ponidziałek");
        days.put(2, "wtorek");
        days.put(3, "środa");
        days.put(4, "czwartek");
        days.put(5, "piątek");
        days.put(6, "sobota");
        days.put(7, "niedziela");
        days.put(8, "piatek"); //wartośći mogą się powtarzać

        System.out.println(days.get(5)); //zwraca wartość przypisaną do klucza

        System.out.println(days.containsKey(6)); //zwróci prawdę, ponieważ para o kluczu 6 istnieje w mapie
        System.out.println(days.containsKey(10)); //zwróci fałsz, ponieważ para o kluczu 10 NIE istnieje w mapie

        System.out.println(days.containsValue("środa"));
        days.remove(8);

        for (Integer key : days.keySet()) { //zwraca zbiór kluczy
            System.out.print(key + " ");
        }

        //************************************
        System.out.println();

        for (String value : days.values()) { //zwraca kolekcję wartości
            System.out.print(value + " ");
        }

        //************************************
        System.out.println();

        for (Map.Entry<Integer, String> entry : days.entrySet()) {
            System.out.print(" Key: " + entry.getKey() + ", value: " + entry.getValue());
        }

    }

}
