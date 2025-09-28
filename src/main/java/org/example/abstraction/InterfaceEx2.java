package org.example.abstraction;

interface InterfaceParent2{
    void m1();
    void m2();
    void m3();

}
abstract class InterfaceParent21 implements InterfaceParent2{
    public void m1(){
        System.out.println("M1 Method");
    }
}
abstract class InterfaceParent22 extends InterfaceParent21{
    public void m2(){
        System.out.println("M2 Method");
    }
}
public class InterfaceEx2 extends InterfaceParent22{
    public static void main(String[] args) {

        InterfaceEx2 iEx2 = new InterfaceEx2();
        iEx2.m1();
        iEx2.m2();
        iEx2.m3();
    }
    @Override
    public void m3() {
        System.out.println("M3 Method");
    }
}
