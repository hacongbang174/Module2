package FactoryMethod;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeFactory<Shape> shapeShapeFactory = new ShapeFactory<>(circle);
        shapeShapeFactory.getShape();
    }
}
