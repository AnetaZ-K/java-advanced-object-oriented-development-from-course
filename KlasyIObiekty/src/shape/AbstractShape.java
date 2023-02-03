package pl.sda.shape;

public abstract class AbstractShape implements AreaCalculable {

    protected ShapeType shapeType;

    public String getShapeName() {
        return shapeType.getName();
    }

}
