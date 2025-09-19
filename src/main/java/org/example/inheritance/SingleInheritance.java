package org.example.inheritance;
class SingleParent{
    void m1(){
        System.out.println("Parent Method");
    }
}

public class SingleInheritance extends SingleParent{
    void m2(){
        System.out.println("Child Method");
    }
    public static void main(String[] args) {
        SingleParent P1 = new SingleParent();
        P1.m1();
        SingleInheritance S1 = new SingleInheritance();
        S1.m1();
        S1.m2();
    }
}
