package org.example.methods;

public class MethodsEx4 {
    //Nested Class allowed
    class abcd{

    }
    void m1(){
        System.out.println("Instance Method");
        //Nested method not allowed
//        void m2(){
//
//        }
    }
    public static void main(String[] args){
        MethodsEx4 mEx4 = new MethodsEx4();
        mEx4.m1();
    }
}
