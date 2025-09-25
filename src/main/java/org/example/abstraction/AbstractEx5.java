package org.example.abstraction;

abstract class AbstractParent5{
    {
        System.out.println("Parent Instance Block");
    }
    public AbstractParent5(){
        System.out.println("Parent Constructor");
    }
}
public class AbstractEx5 extends AbstractParent5{
    {
        System.out.println("Child Instance Block");
    }
    public AbstractEx5() {
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new AbstractEx5();
    }
}
