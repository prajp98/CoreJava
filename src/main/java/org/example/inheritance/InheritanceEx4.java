package org.example.inheritance;
class InheritancePar4{
    int a = 10;
}
public class InheritanceEx4 extends InheritancePar4 {
    int a = 20;
    void m1(int a){
        //Priority to the child class var if no super
        System.out.println("Parent a Value = "+super.a);
        System.out.println("Child a Value = "+this.a);
        System.out.println("Local Variable Value = "+a);
    }
    public static void main(String[] args) {
        new InheritanceEx4().m1(30);
    }
}
