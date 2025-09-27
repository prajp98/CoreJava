package org.example.exception;

public class ExceptionEx5 {
    public static void main(String[] args) {
        try{
            System.out.println("Try");
        }finally{
            System.out.println("Finally");
        }
        System.out.println("Rest of the code");
    }
}
