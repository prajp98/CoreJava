package org.example.exception;

public class ExceptionEx13 {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[0] = 10;
            a[1] = 20;
            a[2] = 30;
            a[3] = 40;
            a[4] = 50;
            a[6] = 60;
        }catch (ArrayIndexOutOfBoundsException aio){
            System.out.println(aio);
        }finally {
            System.out.println("Finally");
        }
        System.out.println("Rest of the code");
    }
}
