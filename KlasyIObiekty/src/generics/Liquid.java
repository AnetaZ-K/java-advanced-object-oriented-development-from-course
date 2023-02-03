package pl.sda.generics;

public abstract class Liquid {

    private final String name;

    protected Liquid(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
