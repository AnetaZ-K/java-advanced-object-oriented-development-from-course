package pl.sda.stream;

import pl.sda.compare.Book;
import pl.sda.compare.Library;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class BookStreamMain {

    public static void main(String[] args) {

        Book b1 = new Book("Ogniem i Mieczem", "Henryk Sienkiewicz", 12345, LocalDate.now().minusYears(100));
        Book b2 = new Book("Pan Tadeusz", "Adam Mickiewicz", 54321, LocalDate.now().minusYears(120));
        Book b3 = new Book("Balladyna", "Juliusz Słowacki", 54311, LocalDate.now().minusYears(130));
        Book b4 = new Book("W Pustyni i w Puszczy", "Henryk Sienkiewicz", 433222, LocalDate.now().minusYears(140));
        Book b5 = new Book("Dziady", "Adam Mickiewicz", 5434321, LocalDate.now().minusYears(114));
        Book b6 = new Book("Lokomotywa", "Jan Brzechwa", 54341111, LocalDate.now().minusYears(143));

        List<Book> bookList = Arrays.asList(b1, b2, b3, b4, b5, b6);

        printBooksForGivenAuthor(bookList, "Henryk Sienkiewicz");

        Library lib1 = new Library("Warszawa", Arrays.asList(b1, b2));
        Library lib2 = new Library("Kraków", Arrays.asList(b3, b4));
        Library lib3 = new Library("Poznań", Arrays.asList(b5, b6));
        List<Library> libraries = Arrays.asList(lib1, lib2, lib3);

        printTitlesFromLibraries(libraries);

    }

    static void printBooksForGivenAuthor(List<Book> books, String author) {
        books.stream()
                .filter((b) -> b.getAuthor().equals(author))
                .map(b -> b.getTitle())
                .forEach(System.out::println);
    }

    static void printTitlesFromLibraries(List<Library> libraries) {
        libraries.stream()
                .map(lib -> lib.getBooks())
                .flatMap(list -> list.stream())
                .map(b -> b.getTitle())
                .forEach(System.out::println);
    }

}
