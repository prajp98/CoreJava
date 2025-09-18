package org.example.instanceblock;

public class InstanceBlockEx4 {
    public InstanceBlockEx4() {
        System.out.println("0 arg Constructor");
    }
    public InstanceBlockEx4(int a) {
        System.out.println("1 arg Constructor = "+a);
    }
    public InstanceBlockEx4(int a, int b) {
        System.out.println("2 arg Constructor = "+a+" "+b);
    }
    public InstanceBlockEx4(int a, int b, int c) {
        System.out.println("3 arg Constructor = "+a+" "+b+" "+c);
    }
    {
        System.out.println("Instance Block - 1 ");
    }
    {
        System.out.println("Instance Block - 2 ");
    }
    {
        System.out.println("Instance Block - 3 ");
    }
    {
        System.out.println("Instance Block - 4 ");
    }
    public static void main(String[] args){
        new InstanceBlockEx4();
        new InstanceBlockEx4(10);
        new InstanceBlockEx4(100, 200);
        new InstanceBlockEx4(1000, 2000, 3000);
    }
}
