package org.example.inheritance;

class InheritancePar3{
    int a = 10;
}
public class InheritanceEx3 extends InheritancePar3{
    int b = 20;
    void m1(){
        System.out.println("Parent a Value = "+a);
        System.out.println("Child a Value = "+b);
    }
    public static void main(String[] args) {
        new InheritanceEx3().m1();
    }
}
