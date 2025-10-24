package org.example.thread;

class ThreadDemo2 extends Thread{
//Uses empty impl run() method in Thread class
}
public class ThreadEx3 {
    public static void main(String[] args) {
        ThreadDemo2 td = new ThreadDemo2();
        td.start();
        for(int i=0; i<=10; i++){
            System.out.println("Main Thread");
        }
    }
}
