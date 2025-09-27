package org.example.exception;

public class ExceptionEx10 {
    void m1(){
        m2();
    }
    void m2(){
        m3();
    }
    void m3(){

            System.out.println(10/0);

    }

    public static void main(String[] args) {
        new ExceptionEx10().m1();
    }
}
