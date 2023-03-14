package com.codegym;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều dài cạnh thứ nhất: ");
        double side1 = scanner.nextDouble();
        System.out.println("Nhập chiều dài cạnh thứ hai: ");
        double side2 = scanner.nextDouble();
        System.out.println("Nhập chiều dài cạnh thứ ba: ");
        double side3 = scanner.nextDouble();
        System.out.println("Nhập màu sắc của tam giác: ");
        String color = scanner.next();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        System.out.println("Các thông tin của tam giác là: ");
        System.out.println(triangle.toString());
    }
}
