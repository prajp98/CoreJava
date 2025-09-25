package org.example.abstraction;
abstract class AbstractParent2{
    abstract void m1();
    abstract void m2();
    abstract void m3();
    void m4(){
        System.out.println("M4 Method");
    }
}
abstract class AbstractParent21 extends AbstractParent{
    void m1(){
        System.out.println("M1 Method");
    }
}
abstract class AbstractParent22 extends AbstractParent21{

    @Override
    void m2() {
        System.out.println("M2 Method");
    }
}

public class AbstractEx2 extends AbstractParent22{
    @Override
    void m3() {
        System.out.println("M3 Method");
    }
    @Override
    void m4() {
        System.out.println("M3 Method");
    }

    public static void main(String[] args) {
        AbstractEx2 aEx2 = new AbstractEx2();
        aEx2.m1();
        aEx2.m2();
        aEx2.m3();
        aEx2.m4();
    }
}
