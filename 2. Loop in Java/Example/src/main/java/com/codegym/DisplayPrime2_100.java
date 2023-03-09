package com.codegym;

import java.util.Scanner;

public class DisplayPrime2_100 {
    public static void main(String[] args) {
        exercisePrime();
    }
    public static void exercisePrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số: ");
        int number = scanner.nextInt();
        boolean check = isPrime(number);
        if (check == true) {
            System.out.println(number + " là số nguyên tó");
        }else{
            System.out.printf("%s không là số nguyên tố", number);
        }
    }
    //
    public static boolean isPrime(int number){
        boolean check = true;
        if (number <= 1) {
            System.out.printf("%s không là số nguyên tố", number);
        }
        for(int i=2;i<number-1;i++){
            if (number % 2  == 0) {
                check = false;
            }
        }
        return check;
    }
}
