package org.example.thread;

class ThreadDemo5 extends Thread{
    public void run(){

    }
}
public class ThreadEx6 {
    public static void main(String[] args) {
        ThreadDemo5 td = new ThreadDemo5();
        td.start();
        for(int i=0; i<=10; i++){
            System.out.println("Main Thread");
        }
    }
}
