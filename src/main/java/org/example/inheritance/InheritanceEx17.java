package org.example.inheritance;

class InheritancePar17 {
    {
        System.out.println("Parent Instance Block - 1");
    }
    {
        System.out.println("Parent Instance Block - 2");
    }
    {
        System.out.println("Parent Instance Block - 3");
    }
    public InheritancePar17(){
        System.out.println("Parent Constructor");
    }
}
public class InheritanceEx17 extends InheritancePar17{
    {
        System.out.println("Child Instance Block - 1");
    }
    {
        System.out.println("Child Instance Block - 2");
    }
    {
        System.out.println("Child Instance Block - 3");
    }
    public InheritanceEx17(){
        System.out.println("Child Constructor");
    }
    public static void main(String[] args) {
        new InheritanceEx17();
    }
}
