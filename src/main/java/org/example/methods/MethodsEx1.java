package org.example.methods;

public class MethodsEx1 {
    void m1(){
        System.out.println("Instance Method");
    }
    static void m2(){
        System.out.println("Static Method");
    }
    public static void main(String[] args){
        System.out.println("Welcome");
        MethodsEx1 mEx1 = new MethodsEx1();
        //Instance method call via object
        mEx1.m1();

        //Static method ways to call
        m2();
        mEx1.m2();
        MethodsEx1.m2();
    }
}
