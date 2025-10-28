package org.example.thread;

class ThreadDemo25 extends Thread{
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
public class ThreadEx25 {
    public static void main(String[] args) {
        ThreadDemo25 t251 = new ThreadDemo25();
        ThreadDemo25 t252 = new ThreadDemo25();
        ThreadDemo25 t253 = new ThreadDemo25();
//        t251.start();
//        //Depracated - Unsupported Operation
//        t251.stop();
//        t252.start();
//        t252.stop();
//        t253.start();
//        t253.stop();

    }
}
