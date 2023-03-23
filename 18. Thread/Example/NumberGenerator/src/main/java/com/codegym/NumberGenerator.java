package com.codegym;

public class NumberGenerator implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count " + i + ", hashCode: " + this.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My thread run is over");
    }
}
