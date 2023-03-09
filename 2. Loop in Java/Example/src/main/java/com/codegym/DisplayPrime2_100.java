package com.codegym;

import java.util.Scanner;

public class DisplayPrime2_100 {
    public static void main(String[] args) {
        int point = 0;
        int count = 0;
        System.out.println("Các số nguyên tố từ 2 đến 100:");
        for (int N = 2; N < 100; N++) {
            if (point < 100) {
                for (int j = 1; j <= N; j++) {
                    if (N % j == 0) {
                        count += 1;
                    }
                }
                if (count == 2) {
                    System.out.println(N);
                }
                count = 0;
            } else {
                break;
            }
        }
    }
}
