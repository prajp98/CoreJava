package org.example.thread;

class ThreadDemo1 extends Thread{
    //Normal method if start() is not used
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("User Defined Thread");
        }
    }
}
public class ThreadEx2 {
    public static void main(String[] args) {
        ThreadDemo1 td = new ThreadDemo1();
        //Cannot call run method directly
        //Does not use threads.
        td.run();
        for(int i=0; i<=10; i++){
            System.out.println("Main Thread");
        }
    }
}
