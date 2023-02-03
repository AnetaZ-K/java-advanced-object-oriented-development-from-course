package pl.sda.generics;

public class Cup<T extends Liquid> {

    private T liquid;


    public Cup(T liquid) {
        this.liquid = liquid;
    }

    public void drink() {
        if (liquid != null) {
            System.out.println("Dringking... " + liquid.getName());
            liquid = null;
        } else {
            System.out.println("Cup is empty!");
        }
    }

    public void fullFillCup(T liquid) {
        if (this.liquid == null) {
            this.liquid = liquid;
        } else {
            System.out.println("Cup is full!");
        }
    }



}
