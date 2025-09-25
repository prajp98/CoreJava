package org.example.inheritance;

class InheritancePar18 {
    static{
        System.out.println("Parent Static Block - 1");
    }
    static{
        System.out.println("Parent Static Block - 2");
    }
    static{
        System.out.println("Parent Static Block - 3");
    }
    {
        System.out.println("Parent Instance Block");
    }
    public InheritancePar18(){
        System.out.println("Parent Constructor");
    }
}
public class InheritanceEx18 extends InheritancePar18{
    static{
        System.out.println("Child Static Block - 1");
    }
    static{
        System.out.println("Child Static Block - 2");
    }
    static{
        System.out.println("Child Static Block - 3");
    }
    {
        System.out.println("Child Instance Block");
    }
    public InheritanceEx18(){
        System.out.println("Child Constructor");
    }
    public static void main(String[] args) {
        new InheritanceEx18();
    }
}
