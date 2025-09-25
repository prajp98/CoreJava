package org.example.inheritance;

class InheritancePar16 {
    {
        System.out.println("Parent Instance Block");
    }
    public InheritancePar16(){
        System.out.println("Parent Constructor");
    }
}
public class InheritanceEx16 extends InheritancePar16{
    {
        System.out.println("Child Instance Block");
    }
    public InheritanceEx16(){
        System.out.println("Child Constructor");
    }
    public static void main(String[] args) {
        new InheritanceEx16();
    }
}