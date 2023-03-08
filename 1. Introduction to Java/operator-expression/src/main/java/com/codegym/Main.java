package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float length;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều rộng (width): ");
        width = scanner.nextFloat();

        System.out.println("Nhập chiều dài (length): ");
        length = scanner.nextFloat();

        float area = width * length;
        System.out.println("Diện tích là:" + area);
    }
}