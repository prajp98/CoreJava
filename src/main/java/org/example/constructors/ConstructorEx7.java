package org.example.constructors;

public class ConstructorEx7 {
    public ConstructorEx7(){
        //Constructor call must be the first statement
        this(10);
        System.out.println("0 arg Constructor");
    }
    public ConstructorEx7(int a){
        this(100,200);
        System.out.println("1 arg Constructor");

    }
    public ConstructorEx7(int a, int b){
        this(1000, 2000, 3000);
        System.out.println("2 arg Constructor");

    }
    public ConstructorEx7(int a, int b, int c){
        System.out.println("3 arg Constructor");

    }
    public static void main(String[] args) {
        new ConstructorEx7();
//        new ConstructorEx7(10);
//        new ConstructorEx7(100, 200);
//        new ConstructorEx7(1000, 2000, 3000);

    }
}
