package org.example.constructors;

public class ConstructorEx8 {
    int b = 20;
    static int c = 30;
    void m1(){
        System.out.println("Instance Method");
    }
    static void m2(){
        System.out.println("Static Method");
    }
    ConstructorEx8(int a){
        System.out.println("1 arg Constructor");
    }
    public ConstructorEx8(){
        this(10);
        int a = 10;

        // ConstructorEx8 cEx8 = new ConstructorEx8();
        System.out.println("Local variable "+a);
        System.out.println("Instance variable "+b);

        System.out.println("Static variable Direct Access"+c);
        //Stack overflow. Donot create object inside constructor
        // System.out.println("Static variable Object Creation "+cEx8.c);
        System.out.println("Static variable using Class name "+ConstructorEx8.c);

        m1();
        m2();
        ConstructorEx8.m2();

    }
    public static void main(String[] args) {
        new ConstructorEx8();
    }
}