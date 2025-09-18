package org.example.instanceblock;

public class InstanceBlockEx5 {
    public InstanceBlockEx5() {
        this(10);
        System.out.println("0 arg Constructor");
    }
    public InstanceBlockEx5(int a) {
        this(100, 200);
        System.out.println("1 arg Constructor = "+a);
    }
    public InstanceBlockEx5(int a, int b) {
        this(1000, 2000, 3000);
        System.out.println("2 arg Constructor = "+a+" "+b);
    }
    public InstanceBlockEx5(int a, int b, int c) {
        System.out.println("3 arg Constructor = "+a+" "+b+" "+c);
    }
    {
        System.out.println("Instance Block");
    }
    public static void main(String[] args) {
        //Instnace block depends on object
        new InstanceBlockEx5();

    }
}
