package org.example.abstraction;

interface InterfaceParent3{
    void m1();
}
public class InterfaceEx3 implements InterfaceParent3{
    @Override
    public void m1() {
        System.out.println("M1 Method");
    }

    public static void main(String[] args) {
        InterfaceEx3 Ex3 = new InterfaceEx3();
        Ex3.m1();
    }
}
