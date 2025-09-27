package org.example.exception;

public class ExceptionEx14 {
    public static void main(String[] args) {
        try{
            try {
                System.out.println(10/0);
            }catch (ArithmeticException ae) {
                System.out.println(ae);
            }
            try{
                int a[] = new int[5];
                a[10] = 100;
            }catch (ArrayIndexOutOfBoundsException aio){
                System.out.println(aio);
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Finally");
        }
        System.out.println("Rest of the code");
    }
}
