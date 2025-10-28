package org.example.thread;

//Anonymous - RUnnable
public class ThreadEx21 {
    public static void main(String[] args) {

        Runnable r21 = new Runnable()
        {
            public void run() {
                System.out.println("First Thread");
            }
        };

        Runnable r22 = new Runnable()
        {
            public void run() {
                System.out.println("Second Thread");
            }
        };

        Thread t21 = new Thread(r21);
        t21.start();
        Thread t22 = new Thread(r22);
        t22.start();


    }
}