package com.codegym;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = creatArray();
        int choice = -1;
        while (choice != 0) {
            for (int i = 0; i < array.length; i++) {
                System.out.println((i + 1) + ". Bạn muốn tính tổng cột " + i);
            }
            int total = 0;
            System.out.println("0. Exit");
            System.out.println("Your choice!");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < array.length; i++) {
                        if (i == 0) {
                            for (int j = 0; j < array[i].length; j++) {
                                total += array[i][j];
                            }
                            System.out.println("Tổng cột " + i + " là: " + total);
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < array.length; i++) {
                        if (i == 1) {
                            for (int j = 0; j < array[i].length; j++) {
                                total += array[i][j];
                            }
                            System.out.println("Tổng cột " + i + " là: " + total);
                            break;
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < array.length; i++) {
                        if (i == 2) {
                            for (int j = 0; j < array[i].length; j++) {
                                total += array[i][j];
                            }
                            System.out.println("Tổng cột " + i + " là: " + total);
                            break;
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < array.length; i++) {
                        if (i == 3) {
                            for (int j = 0; j < array[i].length; j++) {
                                total += array[i][j];
                            }
                            System.out.println("Tổng cột " + i + " là: " + total);
                            break;
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < array.length; i++) {
                        if (i == 4) {
                            for (int j = 0; j < array[i].length; j++) {
                                total += array[i][j];
                            }
                            System.out.println("Tổng cột " + i + " là: " + total);
                            break;
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Your choice do not world!");
                    break;
            }
        }
    }
    public static int[][] creatArray() {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[5][5];
        System.out.println("Nhập phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Phần tử ở vị trí " + i + "-" + j + ":");
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
}
