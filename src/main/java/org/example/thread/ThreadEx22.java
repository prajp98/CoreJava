package org.example.thread;

class ThreadDemo22 extends Thread{
    @Override
    public void run() {
        System.out.println("First Method");
    }
}
class Runnable22 implements Runnable{
    @Override
    public void run() {
        System.out.println("Second Method");
    }
}
public class ThreadEx22 {
    public static void main(String[] args) {

        new ThreadDemo22().start();
        new Thread(new Runnable22()).start();
    }
}