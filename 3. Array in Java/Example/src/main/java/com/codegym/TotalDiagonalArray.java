package com.codegym;

import java.util.Scanner;

public class TotalDiagonalArray {
    public static void main(String[] args) {
        int total = 0;
        int[][] array = creatArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               if (i == j) {
                   total +=array[i][j];
               }
            }
        }
        System.out.println("Tổng đường chéo ma trận là: " + total);
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
