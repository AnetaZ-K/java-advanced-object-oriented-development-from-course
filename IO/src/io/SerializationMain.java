package pl.sda.io;

import java.io.*;
import java.time.LocalDate;

public class SerializationMain {

    public static void main(String[] args) throws Exception {

//        Book b1 = new Book("Ogniem i Mieczem", "Henryk Sienkiewicz", 12345, LocalDate.now().minusYears(100));
//
//        serialize(b1);

        Book deserializedBook = deserialize();
        System.out.println(deserializedBook);

    }

    private static void serialize(Book book) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("book.ser"));
        objectOutputStream.writeObject(book);
        objectOutputStream.close();
    }

    private static Book deserialize() throws Exception {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("book.ser"));
        Book book = (Book) objectInputStream.readObject();
        objectInputStream.close();
        return book;
    }

}
