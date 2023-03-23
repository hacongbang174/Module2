package com.codegym;

public class OddThread implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if(i%2 !=0) {
                    System.out.println("Printing oddNumber: " + i);
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Print oddNumber is over!");
    }
}
