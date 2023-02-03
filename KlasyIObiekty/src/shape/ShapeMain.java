package pl.sda.shape;

public class ShapeMain {

    public static void main(String[] args) {

        AbstractShape circle = new Circle(-10.0);

        AbstractShape square = new Square(15);

        AbstractShape triangle = new Triangle(10, 4);

        AbstractShape [] shapes = new AbstractShape[3];
        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = triangle;


        for (AbstractShape shape : shapes) {
            try {
                System.out.println("Dla kształtu " + shape.getShapeName() + " pole wynosi " + shape.calculateArea());
            } catch (NegativeAreaException exception) {
                System.out.println(exception.getMessage());
            }
        }

    }

}
