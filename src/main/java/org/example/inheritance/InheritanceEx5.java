package org.example.inheritance;

class InheritancePar5{
    void m1(){
        System.out.println("Parent Instance Method");
    }
}
public class InheritanceEx5 extends InheritancePar5{
    void m1(){
        System.out.println("Child Instance Method");
    }
    void m2(){
        super.m1();
        this.m1();
    }
    public static void main(String[] args) {
        new InheritanceEx5().m2();
    }
}
