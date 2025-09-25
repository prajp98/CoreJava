package org.example.polymorphism;

public class MethodOverLoading {
    void m1(){
        System.out.println("0 arg Method");
    }
    void m1(int a){
        System.out.println("1 arg Method = "+a);
    }
    void m1(int a, int b){
        System.out.println("2 arg Method = "+a+" "+b);
    }
    void m1(int a, int b, int c){
        System.out.println("3 arg Method = "+a+" "+b+" "+c);
    }
    void m1(int a, int b, String c){
        System.out.println("3 arg Method = "+a+" "+b+" "+c);
    }

    public static void main(String[] args) {
        MethodOverLoading ov1 = new MethodOverLoading();
        ov1.m1();
        ov1.m1(10);
        ov1.m1(100, 200);
        ov1.m1(1000, 2000, 3000);
        ov1.m1(1000, 2000, "Method Overloading");
    }
}
