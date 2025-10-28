package org.example.thread;

class ThreadDemo14 extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println(Thread.currentThread().getName()+"-------"+i);
        }
    }
}
public class ThreadEx14 {
    public static void main(String[] args) {
        //Thread scheduler decides which thread is executed first
        //Depends on OS too
        ThreadDemo14 t141 = new ThreadDemo14();
        ThreadDemo14 t142 = new ThreadDemo14();

        t141.start();
        t142.start();

    }
}