package org.example.inheritance;
class InheritancePar11{ //extends Object class
    public InheritancePar11(){
        super();
        System.out.println("Parent Constructor");
    }
}
public class InheritanceEx11 extends  InheritancePar11{
    public InheritanceEx11(){
        super();
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new InheritanceEx11();
    }
}
