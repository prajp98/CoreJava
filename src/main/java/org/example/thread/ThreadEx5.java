package org.example.thread;

class ThreadDemo4 extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("0-arg User Defined Thread");
        }
        run(10);
    }
    public void run(int a){
        for(int i=0; i<=10; i++){
            System.out.println("1-arg User Defined Thread");
        }
    }
}
public class ThreadEx5 {
    public static void main(String[] args) {
        ThreadDemo4 td = new ThreadDemo4();
        td.start();
        for(int i=0; i<=10; i++){
            System.out.println("Main Thread");
        }
    }
}
