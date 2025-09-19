package org.example.inheritance;

class MultipleParent{
    void m1(){
        System.out.println("M1 Method");
    }
}
class MultipleChild1 extends MultipleParent{
    void m2(){
        System.out.println("M2 Method");
    }
}
//Not allowed - only extends 1 class
//class MultipleChild2 extends MultipleChild1, MultipleParent{
class MultipleChild2 extends MultipleChild1{
        void m3(){
        System.out.println("M3 Method");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        MultipleParent P1 = new MultipleParent();
        P1.m1();
        MultipleChild1 C1 = new MultipleChild1();
        C1.m1();
        C1.m2();
        MultipleChild2 C2 = new MultipleChild2();
        C2.m1();
        C2.m2();
        C2.m3();
    }
}
