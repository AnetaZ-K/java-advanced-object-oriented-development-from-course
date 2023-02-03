package pl.sda.shape;

public class Circle extends AbstractShape {

    private final double r;

    public Circle(double r) {
        this.r = r;
        this.shapeType = ShapeType.CIRCLE;
    }


    @Override
    public double calculateArea() throws NegativeAreaException {

        if (r < 0) {
            throw new NegativeAreaException("R has invalid value: " + r);
        }

        return r * r * Math.PI;
    }
}
