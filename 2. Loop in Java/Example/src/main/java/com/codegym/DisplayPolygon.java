package com.codegym;

import java.util.Scanner;

public class DisplayPolygon {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.print("1. Print the rectangle \n");
            System.out.print("2. Print the square triangle \n");
            System.out.print("3. Print isosceles triangle \n");
            System.out.print("0. Exit \n");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập chiều rộng: ");
                    int widthRect = input.nextInt();
                    System.out.print("Nhập chiều cao: ");
                    int heightRect = input.nextInt();
                    for (int i = 0; i < heightRect; i++) {
                        for (int j = 0; j < widthRect; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    int choiceTria = -1;
                    while (choiceTria != 0) {
                        System.out.print("1. Print the square triangle: top-left \n");
                        System.out.print("2. Print the square triangle: top-right \n");
                        System.out.print("3. Print the square triangle: bottom-left \n");
                        System.out.print("4. Print the square triangle: bottom-right \n");
                        System.out.print("0. Exit \n");
                        System.out.println("Enter your choice: ");
                        choiceTria = input.nextInt();
                        switch (choiceTria) {
                            case 1:
                                System.out.print("Nhập chiều dài cạnh góc vuông: ");
                                int EdgeTria1 = input.nextInt();
                                for (int i = 0; i < EdgeTria1; i++) {
                                    for (int j = EdgeTria1 - i; j > 0; j--) {
                                        System.out.print("* ");
                                    }
                                    System.out.print("\n");
                                }
                                System.out.print("\n");
                                break;
                            case 2:
                                System.out.print("Nhập chiều dài cạnh góc vuông: ");
                                int EdgeTria2 = input.nextInt();
                                String space = "  ";
                                for (int i = 0; i < EdgeTria2; i++) {
                                    for (int j = EdgeTria2 - i; j > 0; j--) {
                                        System.out.print("* ");
                                    }
                                    System.out.print("\n");
                                    System.out.print(space);
                                    space += "  ";
                                }
                                System.out.print("\n");
                                break;
                            case 3:
                                System.out.print("Nhập chiều dài cạnh góc vuông: ");
                                int EdgeTria3 = input.nextInt();
                                for (int i = 0; i < EdgeTria3; i++) {
                                    for (int j = 0; j <= i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.print("\n");
                                }
                                System.out.print("\n");
                                break;
                            case 4:
                                System.out.print("Nhập chiều dài cạnh góc vuông: ");
                                String space1 = "* ";
                                int EdgeTria4 = input.nextInt();
                                for (int i = 0; i < EdgeTria4; i++) {
                                    for (int j = EdgeTria4 - i; j > 0; j--) {
                                        System.out.print("  ");
                                    }
                                    System.out.print("\n");
                                    System.out.print(space1);
                                    space1 += "* ";
                                }
                                System.out.print("\n");
                                break;
                            case 0:
                                choiceTria = 0;
                                break;
                            default:
                                System.out.println("No choice!");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập chiều dài cạnh tam giác cân: ");
                    int edgeTria = input.nextInt();
                    for (int i = 0; i < edgeTria; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    for (int i = edgeTria; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}