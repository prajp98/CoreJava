package org.example.inheritance;
class InheritanceParent21{
    void m1(){
        System.out.println("M1 Method");
    }
}
class InheritanceParent22 extends InheritanceParent21{
    void m2(){
        System.out.println("M2 Method");
    }
}
class InheritanceParent23 extends InheritanceParent22{
    void m3(){
        System.out.println("M3 Method");
    }
}
public class InheritanceEx2 {
    public static void main(String[] args) {
        InheritanceParent21 P21 = new InheritanceParent21();
        P21.m1();
        InheritanceParent22 P22 = new InheritanceParent22();
        P22.m1();
        P22.m2();
        InheritanceParent23 P23 = new InheritanceParent23();
        P23.m1();
        P23.m2();
        P23.m3();
    }
}
