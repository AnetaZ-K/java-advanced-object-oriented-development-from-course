package pl.sda.functional;

import pl.sda.compare.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class FunctionalMain {

    public static void main(String[] args) {

        Function<String, Integer> quantityOfA = (input) -> {
            int sum = 0;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
                    sum++;
                }
            }

            return sum;
        };

        String input = "asfadfadAAAdsdAA";
        Integer result = quantityOfA.apply(input);
        System.out.println("Input " + input + " has " + result + " 'a' or 'A' chacacters");

        //****************************************************
        Function<Book, String> titleExtractor = (book) -> book.getTitle();
        Book book1 = new Book("Ogniem i Mieczem", "Henryk Sienkiewicz", 12345, LocalDate.of(1878, 10, 12));

        System.out.println(titleExtractor.apply(book1));

        //****************************************************
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(11));

        //***************************************************
        Consumer<Book> isbnSetter = (book) -> book.setIsbn(54321);
        isbnSetter.accept(book1);
        System.out.println("Book ISBN after setting: " + book1.getIsbn());
        //***************************************************

        Supplier<String> stringSupplier = () -> "wyprodukowany napis";
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());

        //****************************************************
        BiFunction<String, Integer, List<String>> stringMultiplier = (str, number) -> {
            List<String> strings = new ArrayList<>();

            for (int i = 0; i < number; i++) {
                strings.add(str);
            }

            return strings;
        };

        System.out.println(stringMultiplier.apply("napis", 100));

        //********************************************
        BinaryOperator<Integer> adder = (a, b) -> a + b;
        System.out.println(adder.apply(1,10));

        //*****************************************
        List<Integer> integers = Arrays.asList(10, 43, 9, 5, -6, 33);
        Collections.sort(integers, (a, b) -> b - a); //sortowanie malejące

        integers.forEach((i) -> System.out.print(i + " "));
//        integers.forEach((i) ->  i * 10); //Błąd kompilacji ponieważ metoda accept jest typu void

        integers.forEach(System.out::println);//przekazanie referencji do metody - potraktuj metodę print jako implementację Consumera
    }

}
