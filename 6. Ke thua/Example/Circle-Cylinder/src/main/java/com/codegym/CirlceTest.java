package com.codegym;

public class CirlceTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(5,"red");
        System.out.println(circle1);

        System.out.println(circle.getArea());
        System.out.println(circle1.getArea());
    }
}
