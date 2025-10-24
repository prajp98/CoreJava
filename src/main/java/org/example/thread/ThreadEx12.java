package org.example.thread;

class ThreadDemo12 extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("Daemon Thread");
        }
    }
}
public class ThreadEx12 {
    public static void main(String[] args) {
        ThreadDemo12 t12 = new ThreadDemo12();
        t12.setDaemon(true);
        t12.start();
        for(int i=0; i<=10; i++){
            System.out.println("Main Thread");
        }

    }
}
