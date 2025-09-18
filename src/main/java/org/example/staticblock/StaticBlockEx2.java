package org.example.staticblock;

public class StaticBlockEx2 {
    static {
        System.out.println("Static block - 1");
    }
    static {
        System.out.println("Static block - 2");
    }
    static {
        System.out.println("Static block - 3");
    }
    static {
        System.out.println("Static block - 4");
    }
    public static void main(String[] args){
        System.out.println("Welcome");
    }
}
