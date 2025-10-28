package org.example.thread;

//Synchronised - at a time only 1 thread can access
//Other threads are in waiting state
//Non Synchronised - at a time multiple threads can access
class A{
    //Object not required
    synchronized static void msg(String msg){
        for(int i=0; i<5; i++){
            System.out.println("Hi ---- "+msg);
            try{
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread{
    public void run(){
        A.msg("AAA");
    }
}
class MyThread2 extends Thread{
    public void run(){
        A.msg("BBB");
    }
}
class MyThread3 extends Thread{
    public void run(){
        A.msg("CCC");
    }
}
class MyThread4 extends Thread{
    public void run(){
        A.msg("DDD");
    }
}

public class ThreadEx23 {
    public static void main(String[] args) {
        new MyThread1().start();
        new MyThread2().start();
        new MyThread3().start();
        new MyThread4().start();
    }
}
