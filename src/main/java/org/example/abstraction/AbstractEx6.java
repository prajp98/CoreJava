package org.example.abstraction;

abstract class AbstractParent6{
    static{
        System.out.println("Parent Static Block");
    }
}
public class AbstractEx6 extends AbstractParent6{
    static{
        System.out.println("Child Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Welcome");
    }
}
