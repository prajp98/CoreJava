package org.example.thread;

//No start method in Runnable
class ThreadDemo17 implements Runnable{
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("User Defined Thread");
        }
    }
}
public class ThreadEx17 {
    public static void main(String[] args) {
        //User defined thread object
        ThreadDemo17 t17 = new ThreadDemo17();
        //Pass it to Thread class object
        Thread t = new Thread(t17);
        t.start();

        for(int i=0; i<=5; i++){
            System.out.println("Main Thread");
        }

    }
}
