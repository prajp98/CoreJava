package org.example.thread;

class ThreadDemo3 extends Thread{
    public void start(){
        for(int i=0; i<=10; i++){
            System.out.println("User Defined Thread");
        }
    }
}
public class ThreadEx4 {
    public static void main(String[] args) {
        ThreadDemo3 td = new ThreadDemo3();
        //Thread not created
        //Normal method called
        td.start();
        for(int i=0; i<=10; i++){
            System.out.println("Main Thread");
        }
    }
}