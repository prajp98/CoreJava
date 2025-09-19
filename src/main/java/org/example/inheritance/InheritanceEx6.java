package org.example.inheritance;

class InheritancePar61{
    int a = 40;
}
class InheritancePar62 extends InheritancePar61{
    int a = 30;
    void m3(){
        System.out.println("Parent Instance Value = "+super.a);
        System.out.println("Child Instance Value = "+this.a);
    }
}
class InheritancePar63 extends InheritancePar62{
    int a = 20;
    void m2(){
        System.out.println("Parent Instance Value = "+super.a);
        System.out.println("Child Instance Value = "+this.a);
        m3();
    }
}
public class InheritanceEx6 extends InheritancePar63{
    int a = 10;
    void m1(int a){
        System.out.println("Parent Instance Value = "+super.a);
        System.out.println("Child Instance Value = "+this.a);
        System.out.println("Local Variable = "+a);
    }
    public static void main(String[] args) {

        new InheritanceEx6().m1(100);
        new InheritanceEx6().m2();
    }
}
