package pl.sda.io;

import java.io.*;

public class BufferedMain {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));

        bufferedReader.lines().forEach(System.out::println);

        bufferedReader.close();

        //****************************************

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text_from_user.txt", true));

        bufferedWriter.write("text z klasy BufferedMain");
        bufferedWriter.newLine();
        bufferedWriter.write("text w nowej linii z klasy BufferedMain");
        bufferedWriter.newLine();

        bufferedWriter.flush();

        bufferedWriter.close();

    }

}
