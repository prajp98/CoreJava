package org.example.inheritance;

class InheritancePar10{
    public InheritancePar10(){
        System.out.println("Parent Constructor");
    }
}
public class InheritanceEx10 extends InheritancePar10{
    public InheritanceEx10(){
        //cant use both super and this
        this(11);
        System.out.println("0 arg constructor");
    }
    public InheritanceEx10(int a){
        this(11, 22);
        System.out.println("1 arg constructor = "+a);
    }
    public InheritanceEx10(int a, int b){
        this(111, 222,333);
        System.out.println("2 arg constructor = "+a+" "+b);
    }
    public InheritanceEx10(int a, int b, int c){
        //super();
        System.out.println("3 arg constructor = "+a+" "+b+" "+c);
    }

    public static void main(String[] args) {
        new InheritanceEx10();
        new InheritanceEx10(10);
        new InheritanceEx10(100,200);
        new InheritanceEx10(1000,2000,3000);
    }
}
