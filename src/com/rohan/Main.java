package com.rohan;

class Worker extends Thread {

    private Integer a;
    private Integer b;

    public Worker(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        //for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + (a + b));
        //}
    }

}

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Worker(1,2);
        Thread t2 = new Worker(3,4);
        Thread t3 = new Worker(10,20);
        t1.start();
        t2.start();
        t3.start();
    }
}
