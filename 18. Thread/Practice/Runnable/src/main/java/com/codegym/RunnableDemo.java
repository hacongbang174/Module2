package com.codegym;

public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    public RunnableDemo(Thread t, String threadName) {
        this.t = t;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Running" + this.threadName);
        try {
            for (int i = 4; i>0; i--){
                System.out.println("Thread : " + this.threadName + "," + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + this.threadName + " interrupted.");
        }
        System.out.println("Thread " + this.threadName + " exiting.");
    }
    public void start() {
        System.out.println("Starting " + this.threadName);
        if (t == null) {
            t = new Thread(this, this.threadName);
            t.start();
        }
    }
}
