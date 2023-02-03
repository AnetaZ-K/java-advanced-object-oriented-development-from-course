package pl.sda.functional;

import pl.sda.compare.Book;

import java.time.LocalDate;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {

        Book book1 = new Book("Ogniem i Mieczem", "Henryk Sienkiewicz", 12345, LocalDate.of(1878, 10, 12));

//        Book book = null; pierwszy wariant - książka jest null
        Book book = book1; //drugi wariant - książka NIE jest null
        Optional<Book> optBook = Optional.ofNullable(book); //dopuszcza przekazywanie referencji wskazującej na null

        System.out.println("Is Book non null? " + optBook.isPresent()); //czy książka znajduje się w Optional

        optBook.ifPresent(System.out::println); //jeśli w Optional jest książka - wypisz ją


        System.out.println(optBook.orElse(book1)); //jeśli w Optionalu jest null - zwróć książkę przekazaną w argumencie

        //optBook.orElseThrow( () -> new NoSuchElementException("Book is null")); //jeśli w Optionalu jest null - rzuć wyjątkiem  NoSuchElementException

        System.out.println(optBook.orElseGet( () -> book1)); //jeśli w Optionalu jest null - zwróć książkę przekazaną jako implementacja Suppliera

        //System.out.println(optBook.get()); //jeśli w Optionalu jest null - rzuć wyjątkiem  NoSuchElementException

        optBook.ifPresentOrElse(
                (arg) -> System.out.println(arg), //wykonaj ciało Consumera jeśli obiekt istnieje
                () -> System.out.println("There is no Book in Optional") //Wykonaj ciało Runnable jeśli obiekt nie istnieje
        );

    }

}
