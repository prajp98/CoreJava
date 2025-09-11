package org.example;

public class VariablesEx3 {
    //Instance Variable
    boolean a;
    //Instance Variable
    int b = 10;

    public static void main(String[] args){

        System.out.println("Welcome");

        VariablesEx3 vEx3 = new VariablesEx3();

        System.out.println("Instance variable = " + vEx3.a);

        System.out.println("Instance variable = " + vEx3.b);

        vEx3.m1();

    }
    void m1(){
        VariablesEx3 vEx3 = new VariablesEx3();

        System.out.println("Instance variable = " + a);

        System.out.println("Instance variable = " + b);
    }
}
