package pl.sda.nested;

public class Outer {

    private int outerInt = 5;

    public static final int X = 1;

    public class Inner {

        private String innerString;

        public Inner(String innerString) {
            this.innerString = innerString;
        }

        public void printOuterInt() {
            System.out.println(outerInt);
        }

        public void printX() {
            System.out.println(X);
        }

        public void printInnerString() {
            System.out.println(innerString);
        }
    }//koniec klasy Inner

    public static class InnerStatic {
        private String innerStaticString;

        public InnerStatic(String innerStaticString) {
            this.innerStaticString = innerStaticString;
        }

        /*public void printOuterInt() {
            System.out.println(outerInt); //błąd kompilacji
        }*/ //Nie można zrealizować dostępu do zmiennej instancyjnej outerInt w klasie wewnętrznej statycznej

        public void printX() {
            System.out.println(X);
        }

        public void printInnerStaticString() {
            System.out.println(innerStaticString);
        }

    } //koniec klasy InnerStatic

    public void methodWithLocalClass() {

        class Local {
            public void printOuterFields() {
                System.out.println(outerInt);
                System.out.println(X);
            }
        }

        Local local = new Local();
        local.printOuterFields();

    }

}
