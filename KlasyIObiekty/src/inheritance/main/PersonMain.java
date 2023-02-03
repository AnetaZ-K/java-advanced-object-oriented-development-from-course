package pl.sda.inheritance.main;

import pl.sda.inheritance.Employee;
import pl.sda.inheritance.Person;

public class PersonMain {

    public static void main(String[] args) {

//        Person person = new Person("Tomasz", "Kowalski", 23);
//
//        //person.setName("Jan");
//
//        person.setAge(24);
//
//        person.print();
//
//        Person person2 = new Person("Jan", "Nowak", 25);
//        person2.print();

        Employee kowalski = new Employee("Michał", "Kowalski", 34, 5000.0);

        kowalski.print();

        Person nowak = new Employee("Anna", "Nowak", 44, 7000.0);
        nowak.print();//wykona się metoda z klasy Employee

        nowak.printSalary();

        nowak = kowalski;
        System.out.println("After change reference nowak = kowalski");
        nowak.print();



    }

}
