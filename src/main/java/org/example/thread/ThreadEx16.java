package org.example.thread;

class ThreadDemo16 extends Thread{
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("User Defined Thread");
            //When there is sleep method used, Handle the Interrupted Exception always
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadEx16 {
    public static void main(String[] args) {

        ThreadDemo16 t16 = new ThreadDemo16();
        t16.start();
        t16.interrupt();

    }
}
