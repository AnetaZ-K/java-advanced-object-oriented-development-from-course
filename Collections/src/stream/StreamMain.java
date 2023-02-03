package pl.sda.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

        List<String> days = Arrays.asList("poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota", "niedziela");

        List<String> result = days.stream()
                .filter((d) -> d.endsWith("a"))
                //.sorted((d1, d2) -> d1.length() - d2.length())
                .sorted(Comparator.comparingInt(String::length).reversed())//niedziela, sobota, środa
                .collect(Collectors.toList());

        System.out.println(result);
        System.out.println(days);
        //******************************************

        long countDays = days.stream()
                .filter((d) -> d.length() >= 7)
                .count();

        System.out.println(countDays);

        //***************************************
        days.stream()
                .map((d) -> d.length())
                .reduce((len1, len2) -> len1 + len2)
                .ifPresent(System.out::println);

        //***********************************************
        days.stream()
                .findFirst()
                .ifPresent(System.out::println);

        //***********************************************
        days.stream()
                .findAny()
                .ifPresent(System.out::println);

        //******************************************
        boolean anyMatchResult = days.stream()
                .anyMatch((d) -> d.length() > 3);//czy jest jakikolwiek dzień tygodnia dłuższy od 3
        System.out.println(anyMatchResult);

        //******************************************
        boolean allMatchResult = days.stream()
                .allMatch((d) -> d.length() > 7);//czy wszystkie dni tygodnia są dłuższe od 7
        System.out.println(allMatchResult);

        //***************************************
        Stream.of(1,5,7,4,3,12,76)
                .reduce((i1, i2) -> i1 + i2)
                .ifPresent(System.out::println);

        Stream.of(1,5,7,4,3,12,76)
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);

        Stream.of(1,5,7,4,3,12,76)
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);


    }

}
