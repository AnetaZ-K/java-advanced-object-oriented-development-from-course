package pl.sda.inheritance;

public abstract class Person implements Printable {

    protected String name;

    protected String surname;

    protected int age;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name + ", surname: " + surname + ", age: " + age);
    }

    public abstract void printSalary();
}
