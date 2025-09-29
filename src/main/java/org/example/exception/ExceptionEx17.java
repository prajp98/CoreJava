package org.example.exception;

import java.util.Scanner;

class Customized extends Exception{

}
public class ExceptionEx17 {
    public static void main(String[] args) throws Customized {
        System.out.println("Enter the input");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Validate(i);
    }

    private static void Validate(int i) throws Customized {
        if(i > 100){
            System.out.println("Valid input");
        }
        else{
            throw new Customized();
        }
    }
}
