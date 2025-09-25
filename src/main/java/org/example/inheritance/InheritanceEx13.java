package org.example.inheritance;

class InheritancePar13{
    // Exectutes default constructor - empty impl
//    public InheritancePar13(){
//        super();
//        System.out.println("Parent Constructor");
//    }
}
public class InheritanceEx13 extends  InheritancePar13{
    public InheritanceEx13(){
        super();
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new InheritanceEx13();
    }
}