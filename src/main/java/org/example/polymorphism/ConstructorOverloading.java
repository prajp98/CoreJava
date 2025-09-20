package org.example.polymorphism;

public class ConstructorOverloading {
    public ConstructorOverloading() {
        System.out.println("0 arg Constructor");
    }
    public ConstructorOverloading(int a) {
        System.out.println("1 arg Constructor = "+a);
    }
    public ConstructorOverloading(int a, int b) {
        System.out.println("2 arg Constructor = "+a+" "+b);
    }
    public ConstructorOverloading(int a, int b, int c) {
        System.out.println("3 arg Constructor = "+a+" "+b+" "+c);
    }
    public ConstructorOverloading(int a, int b, String c) {
        System.out.println("3 arg Constructor = "+a+" "+b+" "+c);
    }

    public static void main(String[] args) {
        new ConstructorOverloading();
        new ConstructorOverloading(10);
        new ConstructorOverloading(100, 200);
        new ConstructorOverloading(1000, 2000, 3000);
        new ConstructorOverloading(1000, 2000, "Constructor Overloading");
    }
}
