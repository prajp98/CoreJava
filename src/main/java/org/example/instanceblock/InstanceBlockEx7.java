package org.example.instanceblock;

public class InstanceBlockEx7 {
    int b = 20;
    static int c = 30;

    void m1(){
        System.out.println("Instance Method");
    }
    static void m2(){
        System.out.println("Static Method");
    }

    public InstanceBlockEx7() {
        System.out.println("Constructor");
    }

    {
        int a = 10;
        //Don't create object in instance block - infinite loop
        //InstanceBlockEx7 Ex7 = new InstanceBlockEx7();
        System.out.println("Local Variable = "+a);
        System.out.println("Instance Variable = "+b);
        System.out.println("Static Variable Direct Access = "+c);
        //System.out.println("Static Variable Using Object = "+Ex7.c);
        System.out.println("Static Variable Using Class Name = "+InstanceBlockEx7.c);
        m1();
        m2();
        InstanceBlockEx7.m2();
    }
    public static void main(String[] args) {
        new InstanceBlockEx7();
    }
}
