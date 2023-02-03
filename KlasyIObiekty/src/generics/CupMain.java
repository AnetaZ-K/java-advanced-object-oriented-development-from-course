package pl.sda.generics;

public class CupMain {

    public static void main(String[] args) {

        Liquid tea = new Tea("green");

        Liquid coffee = new Coffee("latte");

        Cup<Liquid> cup = new Cup<>(tea);

        cup.drink();
        cup.drink();
        cup.drink();

        cup.fullFillCup(coffee);
        cup.fullFillCup(coffee);
        cup.fullFillCup(coffee);

        cup.drink();

/*        Cup<Integer> cupIntegers = new Cup<>(100);
        cupIntegers.drink();*///błąd kompilacji, ponieważ klasa Cup przechowuje tylko typy dziedziczące po Liquid
    }

}
