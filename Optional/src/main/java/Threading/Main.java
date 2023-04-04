package Threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên lớn hơn 1");
        int n = Integer.parseInt(sc.nextLine());
            LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization("Thread-1-HR-Database",n);
            Thread t1 = new Thread(lazyPrimeFactorization, "t1");
            t1.start();
//            t1.interrupt();
            OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization("Thread-2-HR-Database",n);
            Thread t2 = new Thread(optimizedPrimeFactorization,"t2");
            t2.start();
    }
}
