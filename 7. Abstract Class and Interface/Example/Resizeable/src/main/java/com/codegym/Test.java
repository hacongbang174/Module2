package com.codegym;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        Circle circle = new Circle(2,"blue",true);
//        Rectangle rectangle = new Rectangle(3,4,"red",true);
//        Square square = new Square(4,"yellow",false);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2,"blue",true);
        shapes[1] = new Rectangle(3,4,"red",true);
        shapes[2] = new Square(4,"yellow",false);

        System.out.println("Pre-sorted:");
        System.out.println(((Circle) shapes[0]).getArea());
        System.out.println(((Rectangle) shapes[1]).getArea());
        System.out.println(((Square) shapes[2]).getArea());

        double percent = Math.ceil(Math.random()*100);

        System.out.println("After-sorted:");
        System.out.println(((Circle) shapes[0]).resize(percent));
        System.out.println(((Rectangle) shapes[1]).resize(percent));
        System.out.println(((Square) shapes[2]).resize(percent));
    }
}
