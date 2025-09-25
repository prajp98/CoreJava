package org.example.abstraction;
abstract class AbstractParent4{
    public AbstractParent4(){
        System.out.println("Parent Constructor");
    }
}
public class AbstractEx4 extends AbstractParent4{
    public AbstractEx4() {
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new AbstractEx4();
    }
}
