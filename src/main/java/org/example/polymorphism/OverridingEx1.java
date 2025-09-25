package org.example.polymorphism;
class OverridingPar1{
    void m1(){
        System.out.println("Parent Method");
    }
}
public class OverridingEx1 {
    void m1(){
        System.out.println("Child Method");
    }

    public static void main(String[] args) {
        new OverridingEx1().m1();
    }
}
