package org.example.inheritance;

class InheritancePar12{ //extends Object class
    public InheritancePar12(int a){
        super();
        System.out.println("Parent Constructor = "+a);
    }
}
public class InheritanceEx12 extends  InheritancePar12{
    public InheritanceEx12(){
        super(10);
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new InheritanceEx12();
    }
}