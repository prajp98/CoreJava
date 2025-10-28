package org.example.thread;

//Anonymous - No need to create separate class for impl run() Method
public class ThreadEx18 {
    public static void main(String[] args) {
        //No ';'
        Thread t181 = new Thread()
        {
            public void run() {
            System.out.println("First Thread");
            }
        };
        Thread t182 = new Thread()
        {
            public void run() {
            System.out.println("Second Thread");
            }
        };

        t181.start();
        t182.start();
    }
}