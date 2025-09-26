package org.example.abstraction;
interface InterfaceParent5{
    void m1();
}
interface InterfaceParent51 extends InterfaceParent5{
    void m2();
}
interface InterfaceParent52 extends InterfaceParent51,InterfaceParent5{
    void m3();
}
public class InterfaceEx5 implements InterfaceParent52,InterfaceParent51 {
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
        InterfaceEx5 Ex5 = new InterfaceEx5();
        Ex5.m1();
        Ex5.m2();
        Ex5.m3();
    }
}
