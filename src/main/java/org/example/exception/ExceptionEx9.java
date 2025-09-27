package org.example.exception;

public class ExceptionEx9 {
    void m1(){
        m2();
    }
    void m2(){
        m3();
    }
    void m3(){
        try{
            System.out.println(10/0);
        }catch (ArithmeticException ex){
            System.out.println(ex);
            System.out.println(ex.getMessage());
            System.out.println("Divided by zero");
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ExceptionEx9().m1();
    }
}
