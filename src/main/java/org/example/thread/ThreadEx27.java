package org.example.thread;

class ThreadDemo27 extends Thread{
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
public class ThreadEx27 {
    public static void main(String[] args) {
        ThreadDemo27 t271 = new ThreadDemo27();
        ThreadDemo27 t272 = new ThreadDemo27();
        ThreadDemo27 t273 = new ThreadDemo27();
        t271.start();
        t272.start();
        //Depracated
        //t262.suspend();
        t273.start();
        //Depracated
        //t273.resume();


    }
}
