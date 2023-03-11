package com.codegym;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        double delta = this.b*this.b - 4*this.a*this.c;
        return delta;
    }
    public  double getRoot1() {
        double r1 =  (- this.b + Math.pow(getDiscriminant(), 0.5))/(2*this.a);
        return  r1;
    }
    public  double getRoot2() {
        double r2 =  (- this.b - Math.pow(getDiscriminant(), 0.5))/(2*this.a);
        return  r2;
    }
    public  double getDoubleSolution() {
        double x;
        return x = (- this.b) / 2 * this.a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation exp1 = new QuadraticEquation(a,b,c);
        if(a == 0) {
            System.out.println("here is first degree equation");
            return;
        } else {
            if(exp1.getDiscriminant() < 0) {
                System.out.println("the equation has no solution");
                return;
            } else if (exp1.getDiscriminant() == 0) {
                System.out.println("the equation has two double solutions" + exp1.getDoubleSolution());
            } else {
                System.out.println("the equation has two solutions x1: " + exp1.getRoot1());
                System.out.println("the equation has two solutions x2: " + exp1.getRoot2());
            }
        }
    }

}
