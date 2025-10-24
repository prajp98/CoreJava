package org.example.thread;

class ThreadDemo6 extends Thread{
    public void run(){
        System.out.println("User Defined Thread");
    }
}
public class ThreadEx7 {
    public static void main(String[] args) {
        ThreadDemo6 t61 = new ThreadDemo6();
        t61.start();
        ThreadDemo6 t62 = new ThreadDemo6();
        t62.start();
        ThreadDemo6 t63 = new ThreadDemo6();
        t63.start();
        for(int i=0; i<=10; i++){
            System.out.println("Main Thread");
        }
    }
}
