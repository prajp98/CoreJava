package org.example.thread;

class ThreadDemo13 extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("Daemon Thread");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadEx13 {
    public static void main(String[] args) {
        ThreadDemo13 t13 = new ThreadDemo13();
        t13.setDaemon(true);
        t13.start();
        for(int i=0; i<=5; i++){
            System.out.println("Main Thread");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
