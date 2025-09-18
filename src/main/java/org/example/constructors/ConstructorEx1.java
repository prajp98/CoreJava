package org.example.constructors;

public class ConstructorEx1 {
    public ConstructorEx1() {
        System.out.println("0 arg Constructor");
    }
    void m1(){
        System.out.println("M1 Method");
    }

    public static void main(String[] args){
        System.out.println("Welcome");
        ConstructorEx1 cEx1 = new ConstructorEx1();
        cEx1.m1();
    }
}
