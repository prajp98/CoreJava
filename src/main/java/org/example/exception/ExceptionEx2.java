package org.example.exception;

public class ExceptionEx2 {
    public static void main(String[] args) {
        try{
            System.out.println("Result = "+10/5);
            System.out.println("Result = "+10/0);
        }catch(ArithmeticException ex){
            System.out.println(ex);
        }
        System.out.println("Rest of the code");
    }
}
