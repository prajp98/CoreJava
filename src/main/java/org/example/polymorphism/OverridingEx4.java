package org.example.polymorphism;
final class OverridingParent4{
    final void m1(){
        System.out.println("Parent Method");
    }
}
//Final class can't be inherited
//public class OverridingEx4 extends OverridingParent4{

//    void m1(){
//        System.out.println("Child Method");
//    }
public class OverridingEx4{
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Local Variable = "+a);
        a = 100;
        System.out.println("Local Variable = "+a);
        final int b = 20;
        System.out.println("Local Variable = "+b);
        //Final Local Variable value can't be changed
        //b = 200;
        OverridingEx4 Ex4 = new OverridingEx4();
        //Final Method can't be overridden
        //Ex4.m1();

    }
}
