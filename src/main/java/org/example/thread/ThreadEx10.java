package org.example.thread;

class ThreadDemo10 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+"    "+Thread.currentThread().getPriority());
    }
}
public class ThreadEx10 {
    public static void main(String[] args) {
        ThreadDemo10 t101 = new ThreadDemo10();
        t101.setPriority(Thread.MIN_PRIORITY);
        ThreadDemo10 t102 = new ThreadDemo10();
        t102.setPriority(Thread.MAX_PRIORITY);
        t101.start();
        t102.start();

        ThreadDemo10 t103 = new ThreadDemo10();
        t103.start();
        //Illegal ARg exception (only 1-10)
        //t103.setPriority(20);
    }
}

