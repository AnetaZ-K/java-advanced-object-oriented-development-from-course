package pl.sda.shape;

public enum ShapeType {

    SQUARE("kwadrat"), CIRCLE("koło"), TRIANGLE("trójkąt");

    private final String name;

    ShapeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
