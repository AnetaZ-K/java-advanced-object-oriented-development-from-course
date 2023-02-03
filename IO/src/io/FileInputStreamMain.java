package pl.sda.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamMain {

    public static void main(String[] args) {

        //FileReader - klasa służąca do odczytu plików tekstowych

        FileInputStream fileInputStream = null; //Klasa służaca do odczytu plików o różnym rozszerzeniu, trkatuje plik jako strumień bajtów
        try {
            fileInputStream = new FileInputStream("input2.txt");

        int c;

        while ((c = fileInputStream.read()) != -1) {
            System.out.print((char) c);
        }

        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku!");
        } catch (IOException e) {
            System.out.println("Problem z plikiem");
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    System.out.println("Błąd podczas zamykania połączenia z plikiem");
                }
            }
        }
    }
}
