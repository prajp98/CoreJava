package org.example.inheritance;

class InheritanceParent1{
    void m1(){
        System.out.println("M1 Method");
    }
}
class InheritanceParent2{
    void m1(){
        System.out.println("M1 Method");
    }
    void m2(){
        System.out.println("M2 Method");
    }
}
class InheritanceParent3{
    void m1(){
        System.out.println("M1 Method");
    }
    void m2(){
        System.out.println("M2 Method");
    }
    void m3(){
        System.out.println("M3 Method");
    }
}
public class InheritanceEx1 {
    public static void main(String[] args){
        InheritanceParent1 P1 = new InheritanceParent1();
        P1.m1();
        InheritanceParent2 P2 = new InheritanceParent2();
        P2.m1();
        P2.m2();
        InheritanceParent3 P3 = new InheritanceParent3();
        P2.m1();
        P2.m2();
        P3.m3();
    }
}
