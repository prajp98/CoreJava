package org.example.methods;

public class MethodsEx2 {
    void m1(){
        System.out.println("Instance Method");
    }
//    Duplicate method is not allowed
//    void m1(){
//        System.out.println("Instance Method");
//    }
    public static void main(String[] args){
        MethodsEx2 mEx2 = new MethodsEx2();
        mEx2.m1();
    }
}
