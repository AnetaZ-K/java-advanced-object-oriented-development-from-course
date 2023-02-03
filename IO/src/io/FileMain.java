package pl.sda.io;

import java.io.File;
import java.sql.SQLOutput;

public class FileMain {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\micha\\Desktop\\Directory");
        listFilesFromDirectory(file);
    }

    private static void listFilesFromDirectory(File directory) {

        File [] files = directory.listFiles();

       if (files == null) { //jeśli folder jest pusty
           return; //wyjdź z metody
       }

       for (File file : files) {
           System.out.println(file.getParent() + "\n\t" + file.getName());
           if (file.isDirectory()) {
               listFilesFromDirectory(file);
           }
       }
    }
}
