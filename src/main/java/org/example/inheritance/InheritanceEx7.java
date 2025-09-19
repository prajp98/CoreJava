package org.example.inheritance;

class InheritancePar7{
    public InheritancePar7(){
        System.out.println("Parent Constructor");
    }
}

public class InheritanceEx7 extends InheritancePar7{
    public InheritanceEx7(){
        //super();
        System.out.println("Child Constructor");
    }
    public static void main(String[] args) {
        new InheritanceEx7();
    }
}

