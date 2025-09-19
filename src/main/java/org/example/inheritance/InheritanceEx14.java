package org.example.inheritance;

class InheritancePar14{

    public InheritancePar14(){
        super();
        System.out.println("Parent Constructor");
    }
}
public class InheritanceEx14 extends  InheritancePar14{
    //Default Constructor is executed
//    public InheritanceEx14(){
//        super();
//        System.out.println("Child Constructor");
//    }

    public static void main(String[] args) {
        new InheritanceEx14();
    }
}