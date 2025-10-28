package org.example.thread;

class ThreadDemo26 extends Thread{
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
public class ThreadEx26 {
    public static void main(String[] args) {
        ThreadDemo26 t261 = new ThreadDemo26();
        ThreadDemo26 t262 = new ThreadDemo26();
        ThreadDemo26 t263 = new ThreadDemo26();
        t261.start();
        t262.start();
        //Depracated
        //t262.suspend();
        t263.start();


    }
}
