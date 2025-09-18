package org.example.instanceblock;

public class InstanceBlockEx2 {
    //After instance block execution
    public InstanceBlockEx2(){
        System.out.println("Constructor");
    }
    {
        System.out.println("Instance Block");
    }
    public static void main(String[] args){
        new InstanceBlockEx2();
    }
}
