package org.example.abstraction;

interface InterfaceParent41{
    void m1();
}
interface InterfaceParent42 extends InterfaceParent41{
    void m1();
    void m2();
}
interface InterfaceParent43 extends InterfaceParent42{
    void m1();
    void m2();
    void m3();
}
public class InterfaceEx4 implements InterfaceParent43 {
    @Override
    public void m1() {
        System.out.println("M1 Method");
    }

    @Override
    public void m2() {
        System.out.println("M2 Method");
    }

    @Override
    public void m3() {
        System.out.println("M3 Method");
    }

    public static void main(String[] args) {
        InterfaceEx4 Ex4 = new InterfaceEx4();
        Ex4.m1();
        Ex4.m2();
        Ex4.m3();
    }
}
