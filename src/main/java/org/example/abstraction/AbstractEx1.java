package org.example.abstraction;
abstract class AbstractParent{
    //abstract methods can only be declared in abstract class
    //cannot create objects here
    abstract void m1();
    abstract void m2();
    abstract void m3();
    void m4(){
        System.out.println("M4 Method");
    }

}
public class AbstractEx1 extends AbstractParent{
    public static void main(String[] args) {
        AbstractEx1 aEx1 = new AbstractEx1();
        aEx1.m1();
        aEx1.m2();
        aEx1.m3();
        aEx1.m4();
    }

    @Override
    void m1() {
        System.out.println("M1 Method");
    }

    @Override
    void m2() {
        System.out.println("M2 Method");
    }

    @Override
    void m3() {
        System.out.println("M3 Method");
    }
}
