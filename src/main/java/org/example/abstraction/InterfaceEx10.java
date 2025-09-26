package org.example.abstraction;
//To clone use Cloneable marker interface and handle CloneNotSupportedException
public class InterfaceEx10 implements Cloneable{

    int id = 10;
    String name = "John";

    void m1(){
        System.out.println("M1 Method");
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        InterfaceEx10 Ex10 = new InterfaceEx10();
        System.out.println(Ex10.id);
        System.out.println(Ex10.name);
        Ex10.m1();

        InterfaceEx10 ex = (InterfaceEx10) Ex10.clone();
        System.out.println(ex.id);
        System.out.println(ex.name);
        ex.m1();
    }
}
