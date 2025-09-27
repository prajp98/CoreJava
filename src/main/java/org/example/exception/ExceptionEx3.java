package org.example.exception;

public class ExceptionEx3 {
    public static void main(String[] args) {

        //String str = "Welcome";
        //String str="";
        String str=null;
        try{
            System.out.println("String length : "+str.length());
        }catch(NullPointerException ex){
            System.out.println(ex);
        }

    }
}
