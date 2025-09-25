package org.example.abstraction;
abstract class AbstractParent3{
    int a = 10;
    abstract void m1();
}
public class AbstractEx3 extends AbstractParent3{
    public static void main(String[] args) {
        AbstractEx3 aEx3 = new AbstractEx3();
        aEx3.m1();
    }

    @Override
    void m1() {
        System.out.println("a Value = "+a);
        a = 100;
        System.out.println("Modified a Value = "+a);
    }
}
