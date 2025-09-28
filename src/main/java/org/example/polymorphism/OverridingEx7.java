package org.example.polymorphism;
class OverridingParent7{
    void m1(){
        System.out.println("Parent M1 Method");
    }
}
public class OverridingEx7 extends OverridingParent7{
    //Child class modifier must be = or > accessibility
    //public > protected > default > private
    public void m1(){
        System.out.println("Child M1 Method");
    }

    public static void main(String[] args) {
        new OverridingEx7().m1();
    }
}
