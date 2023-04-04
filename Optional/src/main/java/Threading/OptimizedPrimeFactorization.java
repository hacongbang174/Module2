package Threading;

import java.util.Arrays;

public class OptimizedPrimeFactorization implements Runnable{
    int n;
    private Thread thread;
    private String name;

    public OptimizedPrimeFactorization() {
    }

    public OptimizedPrimeFactorization(String name) {
        this.name = name;
        System.out.println("Creating " + name);
    }

    public OptimizedPrimeFactorization(String name, int n) {
        this.n = n;
        this.name = name;
        System.out.println("Creating " + name);
    }

    @Override
    public void run() {
        boolean[] isPrime = new boolean[n + 1];

        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print("Thread: " + name + ", " + i + "\n");
            }
        }
    }
//    public void start() {
//        System.out.println("Starting " + name);
//        if (thread == null) {
//            thread = new Thread(this, name);
//            thread.start();
//        }
//    }
}
