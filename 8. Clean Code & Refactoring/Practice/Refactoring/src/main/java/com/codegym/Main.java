package com.codegym;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = calculator.calculate(4,5,'+');
        System.out.println(a);
    }
}