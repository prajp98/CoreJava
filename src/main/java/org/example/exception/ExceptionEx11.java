package org.example.exception;

public class ExceptionEx11 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }catch (NullPointerException np){
            System.out.println(np);
        }catch (NumberFormatException nfe){
            System.out.println(nfe);
        }catch(StringIndexOutOfBoundsException sie ){
            System.out.println(sie);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Rest of the code");

    }

}
