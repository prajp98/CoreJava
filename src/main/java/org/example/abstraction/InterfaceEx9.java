package org.example.abstraction;

interface InterfaceParent91{
    int a = 10;
}
interface InterfaceParent92{
    int b = 20;
    int a = 100;
}
public class InterfaceEx9 implements InterfaceParent91,InterfaceParent92{

    void m1(){
        System.out.println("a Value = "+InterfaceParent91.a);
        System.out.println("a Value = "+InterfaceParent92.a);
        System.out.println("b Value = "+b);
    }

    public static void main(String[] args) {
        new InterfaceEx9().m1();
    }
}
