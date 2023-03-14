package com.codegym;

import java.awt.*;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle() {
    }
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide1() {
        return this.side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide3() {
        return this.side3;
    }
    public double getPerimeter() {
        return (getSide1()+getSide2()+getSide3())/2;
    }
    public double getArea() {
        return Math.sqrt(getPerimeter()*(getPerimeter()-getSide1())*(getPerimeter()-getSide2())*(getPerimeter()-getSide3()));
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + super.getColor()
                + ", Area: "
                + getArea()
                + ", Perimeter: "
                + getPerimeter();
    }
}
