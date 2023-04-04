package FactoryMethod;

public class ShapeFactory<Shape> {
    private Shape shape;

    public ShapeFactory(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return this.shape;
    }
}
