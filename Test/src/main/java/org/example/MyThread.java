package org.example;

public class MyThread extends Thread {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            increment();
        }
    }

    public int getCount() {
        return count;
    }
}

