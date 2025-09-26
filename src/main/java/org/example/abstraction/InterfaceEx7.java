package org.example.abstraction;

class InterfaceParent71{
    interface InterfaceParent72{
        void m1();
    }
}
public class InterfaceEx7 implements InterfaceParent71.InterfaceParent72 {
    @Override
    public void m1() {
        System.out.println("M1 Method");
    }

    public static void main(String[] args) {
        InterfaceEx7 Ex7 = new InterfaceEx7();
        Ex7.m1();
    }
}
