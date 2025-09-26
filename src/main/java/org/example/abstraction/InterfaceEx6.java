package org.example.abstraction;

interface InterfaceEx61{
    void m1();
    interface InterfaceEx62{
        void m2();
    }
}
public class InterfaceEx6 implements InterfaceEx61, InterfaceEx61.InterfaceEx62 {
    @Override
    public void m1() {
        System.out.println("M1 Method");
    }

    @Override
    public void m2() {
        System.out.println("M2 Method");
    }

    public static void main(String[] args) {
        InterfaceEx6 Ex6 = new InterfaceEx6();
        Ex6.m1();
        Ex6.m2();
    }
}
