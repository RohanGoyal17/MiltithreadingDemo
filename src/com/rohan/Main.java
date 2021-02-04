package com.rohan;


class Worker extends Thread {

    private Integer a;
    private Integer b;
    private Integer x = 1;

    public Worker(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getX() {
        return x;
    }

    @Override
    public void run() {
        //for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + (a + b));
            x = a+b;
        //}
    }

}

public class Main {
    public static void main(String[] args) {
        Worker t1 = new Worker(1,2);
        Worker t2 = new Worker(3,4);
        Worker t3 = new Worker(10,20);
        t1.start();
        t2.start();
        t3.start();
        //for(int i = 0; i< 100; i++)
        System.out.println(t1.getX());
        try{
            t1.join();
        }catch (Exception e){
            System.out.println("Joining error");
        }
        System.out.println(t1.getX());
    }
}
