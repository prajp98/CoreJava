package org.example.abstraction;

interface InterfaceParent1{
    void m1();
    void m2();
    void m3();
    // Method impl can't be written in interface
//    void m4(){
//
//    }

}
public class InterfaceEx1 implements InterfaceParent1{
    public static void main(String[] args) {
        InterfaceEx1 iEx1 = new InterfaceEx1();
        iEx1.m1();
        iEx1.m2();
        iEx1.m3();
        //Interface Obj can't be created
        //InterfaceParent1 P1 = new InterfaceParent1();
    }
    //Method impl must be public
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
}
