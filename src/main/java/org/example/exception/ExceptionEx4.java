package org.example.exception;

public class ExceptionEx4 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException ex){
            System.out.println(ex);
        }finally{
            System.out.println("Finally");
        }
        System.out.println("Rest of the code");
    }
}
