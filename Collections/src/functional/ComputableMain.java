package pl.sda.functional;

import java.math.BigDecimal;

public class ComputableMain {

    public static void main(String[] args) {

        Computable adder = (a, b) -> a + b;

        System.out.println(adder.compute(123.45, 457.1));

        Computable multiplier = (a, b) -> a * b;
        System.out.println(multiplier.compute(12, 10));

        //poniższe jest odpowiednikiem wyrażenia lambda
        /*Computable adderAnonymous = new Computable() {
            @Override
            public double compute(double a, double b) {
                return a + b;
            }
        };*/

        //BigDecimal używamy jeśli chcemy zachować precyzję liczb zmiennoprzewcinkiwych
        BigDecimal b1 = BigDecimal.valueOf(123.45);
        BigDecimal b2 = BigDecimal.valueOf(457.1);
        System.out.println(b1.add(b2));

    }

}
