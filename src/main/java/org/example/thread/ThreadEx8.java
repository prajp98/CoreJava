package org.example.thread;

class ThreadDemo61 extends Thread{
    public void run(){
        System.out.println("User Defined Thread-1");
    }
}
class ThreadDemo62 extends Thread{
    public void run(){
        System.out.println("User Defined Thread-2");
    }
}
class ThreadDemo63 extends Thread{
    public void run(){
        System.out.println("User Defined Thread-3");
    }
}
public class ThreadEx8 {
    public static void main(String[] args) {
        ThreadDemo61 t61 = new ThreadDemo61();
        t61.start();
        ThreadDemo62 t62 = new ThreadDemo62();
        t62.start();
        ThreadDemo63 t63 = new ThreadDemo63();
        t63.start();
        for(int i=0; i<=10; i++){
            System.out.println("Main Thread");
        }
    }
}
