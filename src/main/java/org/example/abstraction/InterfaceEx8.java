package org.example.abstraction;

interface InterfaceParent8{
    void m1();
    int a = 10;
}
public class InterfaceEx8 implements InterfaceParent8{
    @Override
    public void m1() {
        System.out.println("a value = "+a);
        //Variable is considered final
        // a=100;
    }

    public static void main(String[] args) {
        InterfaceEx8 Ex8 = new InterfaceEx8();
        Ex8.m1();
    }
}
