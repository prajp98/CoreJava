package org.example.thread;

class ThreadDemo91 extends Thread{
    public void run(){

    }
}
public class ThreadEx9 {
    public static void main(String[] args) {
        ThreadDemo6 t91 = new ThreadDemo6();
        t91.start();
        ThreadDemo6 t92 = new ThreadDemo6();
        t92.start();

        //Get name of Thread
        System.out.println(t91.getName());
        System.out.println(t92.getName());

        //Set name of Thread
        t91.setName("aaa");
        t92.setName("bbb");

        System.out.println(t91.getName());
        System.out.println(t92.getName());

        //Main thread executing currently
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("ccc");

        System.out.println(Thread.currentThread().getName());

        //Get id of thread -depracated -id is assigned by thread scheduler
        System.out.println(t91.getId());
        System.out.println(t92.getId());

        System.out.println(Thread.currentThread().getId());

        System.out.println(t91.isAlive());
        System.out.println(t92.isAlive());

        //Result varies -no. of running threads
        System.out.println(Thread.activeCount());

        //10
        System.out.println(Thread.MAX_PRIORITY);
        //1
        System.out.println(Thread.MIN_PRIORITY);
        //5
        System.out.println(Thread.NORM_PRIORITY);

        System.out.println(Thread.currentThread().isAlive());








    }
}
