package pl.sda.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOFilesMain {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("input.txt");

        System.out.println(Files.exists(path));

        if (!Files.exists(path)) {
            Files.createFile(path);
        }

        if (Files.isWritable(path)) {
            Files.write(path, "\nText z klasy NIOFilesMain".getBytes(), StandardOpenOption.APPEND);
        }

        Files.readAllLines(path)
                .stream()
                .forEach(System.out::println);

        Files.delete(path);



    }

}
