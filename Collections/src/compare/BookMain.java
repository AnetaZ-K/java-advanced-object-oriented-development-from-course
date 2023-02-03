package pl.sda.compare;

import java.time.LocalDate;

public class BookMain {

    public static void main(String[] args) {

        Book book1 = new Book("Ogniem i Mieczem", "Henryk Sienkiewicz", 12345, LocalDate.of(1878, 10, 12));

        Book book2 = new Book("Pan Tadeusz", "Adam Mickiewicz", 12340, LocalDate.of(1838, 12, 23));

        Book book3 = new Book("Pan Tadeusz", "Adam Mickiewicz", 12340, LocalDate.of(1838, 12, 23));

        System.out.println(book1 == book2);

        System.out.println(book2 == book3);

        System.out.println(book2.equals(book3));

        System.out.println(book1);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());

        System.out.println(book1.compareTo(book2));
        System.out.println(book2.compareTo(book3));
        System.out.println(book2.compareTo(book1));

        BookComparator bookComparator = new BookComparator();
        System.out.println(bookComparator.compare(book1, book2));
    }

}
