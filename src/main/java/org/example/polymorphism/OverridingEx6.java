package org.example.polymorphism;
class OverridingParent6{
    static void m1(){
        System.out.println("Parent M1 Method");
    }
}
public class OverridingEx6 extends OverridingParent6{
    //Static methods can't be overridden
//    void m1(){
//        System.out.println("Child M1 Method");
//    }
    public static void main(String[] args) {
        new OverridingEx6().m1();
    }
}
