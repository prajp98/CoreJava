package org.example.thread;

public class ThreadEx20 {
    public static void main(String[] args) {

        Thread t20 = new Thread()
        {
            public void run() {
                System.out.println("First Thread");
            }
        };

        t20.start();
        //Exception - Illegal Thread State
        //Can start a thread only once
        t20.start();


    }
}
