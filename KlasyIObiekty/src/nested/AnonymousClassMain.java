package pl.sda.nested;

public class AnonymousClassMain {

    public static void main(String[] args) {

        AbstractPrinter abstractPrinter = new AbstractPrinter() {
            @Override
            public void print() {
                System.out.println("print from anonymous class");
            }
        };


        abstractPrinter.print();

    }

}
