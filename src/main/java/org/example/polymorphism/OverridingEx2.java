package org.example.polymorphism;

class OverridingPar2{
    int m1(){
        System.out.println("Parent Method");
        return 10;
    }
}
public class OverridingEx2 extends OverridingPar2{
    //Method return type is incompatible
    //Parent = child return type must
    //void m1(){}
    int m1(){
        System.out.println("Child Method");
        return 100;
    }

    public static void main(String[] args) {
        OverridingEx2 Ex2 = new OverridingEx2();
        int res = Ex2.m1();
        System.out.println(res);
    }
}