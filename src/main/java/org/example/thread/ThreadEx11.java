package org.example.thread;

class ThreadDemo11 extends Thread{
    public void run(){
        System.out.println("HOOK THREAD");
    }
}
public class ThreadEx11 {
    public static void main(String[] args) {
        ThreadDemo11 t11 = new ThreadDemo11();
        //Continuously monitors currently running thread
        //Using runtime class
        //If there is normal/abnormal termination
        //Hook thread is executed in the next second
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(t11);
        for(int i=0;i<=10;i++){
            System.out.println("Main Thread");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i==5){
                System.exit(0);
            }
        }
    }
}
