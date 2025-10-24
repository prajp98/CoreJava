package org.example.thread;

class ThreadDemo extends Thread{
    //Overrides run method in Thread Class(Zero arg Empty impl run method)
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("User Defined Thread");
        }
    }
}
public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        //Starts Thread
        //Internally calls run() method
        td.start();
        //Highest priority thread
        for(int i=0; i<=10; i++){
            System.out.println("Main Thread");
        }
    }
}