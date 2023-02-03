package pl.sda.shape;

public class Square extends AbstractShape {

    private final double a;

    public Square(double a) {
        this.a = a;
        this.shapeType = ShapeType.SQUARE;
    }


    @Override
    public double calculateArea() throws NegativeAreaException {
        if (a < 0) {
            throw new NegativeAreaException("A has invalid value: " + a);
        }

        return a * a;
    }
}
