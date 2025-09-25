package org.example.inheritance;

class InheritancePar9{
    public InheritancePar9(){
        System.out.println("Parent Constructor");
    }
}
public class InheritanceEx9 extends InheritancePar9{
    public InheritanceEx9(){
        //cant use both super and this
        super();
        System.out.println("0 arg constructor");
    }
    public InheritanceEx9(int a){
        super();
        System.out.println("1 arg constructor = "+a);
    }
    public InheritanceEx9(int a, int b){
        super();
        System.out.println("2 arg constructor = "+a+" "+b);
    }
    public InheritanceEx9(int a, int b, int c){
        super();
        System.out.println("3 arg constructor = "+a+" "+b+" "+c);
    }

    public static void main(String[] args) {
        new InheritanceEx9();
        new InheritanceEx9(10);
        new InheritanceEx9(100,200);
        new InheritanceEx9(1000,2000,3000);
    }
}
