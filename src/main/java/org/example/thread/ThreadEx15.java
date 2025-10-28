package org.example.thread;

class ThreadDemo15 extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println(Thread.currentThread().getName()+"-------"+i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadEx15 {
    public static void main(String[] args) {

        ThreadDemo15 t151 = new ThreadDemo15();
        ThreadDemo15 t152 = new ThreadDemo15();

        t151.start();

        try{
            //Priority to join() method
            //Other threads are in waiting state
            //Only after execution of this thread other threads are execute
            t151.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t152.start();

        for(int i=0; i<=10; i++){
            System.out.println("Main Thread");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
