package pl.sda.compare;

import java.util.List;

public class Library {

    private String city;

    private List<Book> books;

    public Library(String city, List<Book> books) {
        this.city = city;
        this.books = books;
    }

    public String getCity() {
        return city;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "city='" + city + '\'' +
                ", books=" + books +
                '}';
    }
}
