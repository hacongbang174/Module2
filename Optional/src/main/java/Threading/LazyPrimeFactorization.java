package Threading;

import java.util.Scanner;

public class LazyPrimeFactorization implements Runnable{

    private Thread thread;
    String threadName;
    int n;

    public LazyPrimeFactorization() {
    }

    public LazyPrimeFactorization(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    public LazyPrimeFactorization(String threadName, int n) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
        this.n = n;
    }

    @Override
    public void run() {
        try {
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print("Thread: " + threadName + ", " + i + "\n");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
//    public void start() {
//        System.out.println("Starting " + threadName);
//        if (thread == null) {
//            thread = new Thread(this, threadName);
//            thread.start();
//        }
//    }
}
