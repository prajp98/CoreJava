package org.example.exception;

import java.util.Scanner;

public class ExceptionEx15 {
    public static void main(String[] args) {
        System.out.println("Enter the input");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Validate(i);
    }

    static void Validate(int i) {
        if (i > 100){
            System.out.println("Valid Input");
        }
        else{
            System.out.println("Not a valid input");
            throw new ArithmeticException();
        }
    }
}
