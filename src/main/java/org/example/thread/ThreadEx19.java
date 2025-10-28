package org.example.thread;

public class ThreadEx19 {
    public static void main(String[] args) {
        //Nameless
        new Thread()
        {
            public void run() {
                System.out.println("First Thread");
            }
        }.start();
        new Thread()
        {
            public void run() {
                System.out.println("Second Thread");
            }
        }.start();

    }
}
