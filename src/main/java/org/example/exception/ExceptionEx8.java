package org.example.exception;

public class ExceptionEx8 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException ex){
            System.out.println(ex);
            System.out.println(ex.getMessage());
            System.out.println("Divided by zero");
            ex.printStackTrace();
        }
        System.out.println("Rest of the code");
    }
}
