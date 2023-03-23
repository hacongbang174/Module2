package com.codegym;

public class EvenThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Printing evenNumber: " + i);
                    Thread.sleep(15);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Print evenNumber is over!");
    }
}
