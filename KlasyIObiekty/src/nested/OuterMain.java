package pl.sda.nested;

public class OuterMain {

    public static void main(String[] args) {

        Outer outer = new Outer();

        outer.methodWithLocalClass();

//        Outer.Inner inner = outer.new Inner("inner string");
//        inner.printOuterInt();
//        inner.printX();
//        inner.printInnerString();
//
//        Outer.InnerStatic innerStatic = new Outer.InnerStatic("inner static string");
//        innerStatic.printX();
//        innerStatic.printInnerStaticString();



    }

}
