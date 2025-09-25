package org.example.inheritance;

class InheritancePar8{
    public InheritancePar8(){
        System.out.println("Parent Constructor");
    }
}
public class InheritanceEx8 extends InheritancePar8{
    //if super is not present, compiler will execute parent constructor
    public InheritanceEx8(){
        System.out.println("0 arg constructor");
    }
    public InheritanceEx8(int a){
        System.out.println("1 arg constructor = "+a);
    }
    public InheritanceEx8(int a, int b){
        System.out.println("2 arg constructor = "+a+" "+b);
    }
    public InheritanceEx8(int a, int b, int c){
        System.out.println("3 arg constructor = "+a+" "+" "+c);
    }

    public static void main(String[] args) {
        new InheritanceEx8();
        new InheritanceEx8(10);
        new InheritanceEx8(100,200);
        new InheritanceEx8(1000,2000,3000);
    }
}
