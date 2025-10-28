package org.example.thread;

//Deadlock
//At a time 2 or more threads are executing
//First thread trying to access second
//Second thread trying to access first
//Both are in waiting state
public class ThreadEx24 {
    public static void main(String[] args) {
        final String resource1 = "aaa";
        final String resource2 = "bbb";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1 : Locked Resource 1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {

                    }
                    synchronized (resource2) {
                        System.out.println("Thread 1 : Locked Resource 2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2 : Locked Resource 2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {

                    }
                    synchronized (resource1) {
                        System.out.println("Thread 2 : Locked Resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
