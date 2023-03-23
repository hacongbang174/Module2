package com.codegym;

public class TestThread {
    public static void main(String[] args) {
        Thread odd = new Thread(new OddThread());
        Thread even = new Thread(new EvenThread());
        odd.start();
        try {
            odd.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        even.start();
        try {
            even.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
