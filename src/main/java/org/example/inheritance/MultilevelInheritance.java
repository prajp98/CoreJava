package org.example.inheritance;
class MultilevelParent1{
    void m1(){
        System.out.println("M1 Method");
    }
}
class MultilevelParent2 extends MultilevelParent1{
    void m2(){
        System.out.println("M2 Method");
    }
}
class MultilevelParent3 extends MultilevelParent2{
    void m3(){
        System.out.println("M3 Method");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        MultilevelParent1 P1 = new MultilevelParent1();
        P1.m1();
        MultilevelParent2 P2 = new MultilevelParent2();
        P2.m1();
        P2.m2();
        MultilevelParent3 P3 = new MultilevelParent3();
        P3.m1();
        P3.m2();
        P3.m3();
    }
}
