package org.example.exception;

import java.util.Scanner;

class CustomizedMsg extends Exception{
    public CustomizedMsg(String str){
        super(str);
    }

}
public class ExceptionEx18 {
    public static void main(String[] args) throws CustomizedMsg {
        System.out.println("Enter the input");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Validate(i);
    }

    private static void Validate(int i) throws CustomizedMsg {
        if(i > 100){
            System.out.println("Valid input");
        }
        else{
            throw new CustomizedMsg("Not a Valid Input");
        }
    }
}
