package org.example.instanceblock;

public class InstanceBlockEx3 {
    public InstanceBlockEx3() {
        System.out.println("0 arg Constructor");
    }
    public InstanceBlockEx3(int a) {
        System.out.println("1 arg Constructor");
    }
    public InstanceBlockEx3(int a, int b) {
        System.out.println("2 arg Constructor");
    }
    public InstanceBlockEx3(int a, int b, int c) {
        System.out.println("3 arg Constructor");
    }
    {
        System.out.println("Instance Block");
    }
    public static void main(String[] args){
        new InstanceBlockEx3();
        new InstanceBlockEx3(10);
        new InstanceBlockEx3(100, 200);
        new InstanceBlockEx3(1000, 2000, 3000);
    }
}
