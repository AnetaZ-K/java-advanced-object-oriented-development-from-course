package pl.sda.shape;

public class Triangle  extends AbstractShape {

    private final double a;

    private final double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
        this.shapeType = ShapeType.TRIANGLE;
    }

    @Override
    public double calculateArea() throws NegativeAreaException {

        if (a < 0 || h < 0) {
            throw new NegativeAreaException("A or H has invalid value: " + a + ", " + h);
        }

        return (a * h) / 2;
    }
}
