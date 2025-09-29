package org.example.exception;

public class ExceptionEx16 {
    void m1() throws InterruptedException {
        m2();
    }
    void m2() throws InterruptedException {
        m3();
    }
    void m3() throws InterruptedException{
        System.out.println("Start");
        Thread.sleep(5000);
        System.out.println("Stop");
    }
    public static void main(String[] args) throws InterruptedException {
        new ExceptionEx16().m1();
    }
}
