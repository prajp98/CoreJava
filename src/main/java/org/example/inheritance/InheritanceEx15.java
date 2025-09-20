package org.example.inheritance;

class InheritancePar15 {
    {
        System.out.println("Parent Instance Block");
    }
}
public class InheritanceEx15 extends InheritancePar15{
    {
        System.out.println("Child Instance Block");
    }
    public static void main(String[] args) {
        new InheritanceEx15();
    }
}