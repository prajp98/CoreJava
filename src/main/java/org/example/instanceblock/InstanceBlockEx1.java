package org.example.instanceblock;

public class InstanceBlockEx1 {
    {
        System.out.println("Instance Block");
    }
    public static void main(String[] args){
        System.out.println("Welcome");
        InstanceBlockEx1 Ex1 = new InstanceBlockEx1();
        new InstanceBlockEx1();
    }
}