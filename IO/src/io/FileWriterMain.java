package pl.sda.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterMain {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String input = "";

        FileWriter fileWriter = new FileWriter("text_from_user.txt", true); //plik jeśli nie istnieje to zostanie utworzony

        do {
            if (scanner.hasNextLine()) {
                input = scanner.nextLine();

                if (!input.equals("end")) {
                    fileWriter.write(input);
                    fileWriter.write("\n");
                }
            }

        } while (!input.equals("end"));

        fileWriter.close();

    }

}
