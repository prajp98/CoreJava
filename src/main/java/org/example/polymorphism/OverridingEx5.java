package org.example.polymorphism;

class OverridingParent5{
    void m1(){
        System.out.println("Parent M1 Method");
    }
    void m2(){
        System.out.println("Parent M2 Method");
    }
}
public class OverridingEx5 extends OverridingParent5{
    void m1(){
        System.out.println("Child M1 Method");
    }
    void m3(){
        System.out.println("Child M3 Method");
    }
    public static void main(String[] args) {
        OverridingParent5 P5 = new OverridingParent5();
        P5.m1();
        P5.m2();
        OverridingEx5 Ex5 = new OverridingEx5();
        Ex5.m1();
        Ex5.m2();
        Ex5.m3();

        //Child obj - Referred to parent
        //Can access overridden child methods and parent methods +
        //Typecasted child methods
        OverridingParent5 P51 = new OverridingEx5();
        P51.m1();
        P51.m2();
        //Can be accessed by typecasting
        ((OverridingEx5) P51).m3();

        //Parent obj - referred to child obj
        //Parent class does not know about child class
        //OverridingEx5 Ex51 = new OverridingParent5();



    }
}
