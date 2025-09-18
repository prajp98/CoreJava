package org.example.variables;

public class VariablesEx2 {
    public static void main(String[] args){
        int a = 10;
        System.out.println("Local variable = "+a);
        a = 100;
        System.out.println("Modified local variable = "+a);

        int b = 20;
        System.out.println("Local variable = "+b);

        final int c = 20;
        System.out.println("Final local variable = "+c);

        //c=100;
    }
//    void m1(){
//        System.out.println("Local variable = "+a);
//    }
}
