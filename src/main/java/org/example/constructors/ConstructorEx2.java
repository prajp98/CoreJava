package org.example.constructors;

public class ConstructorEx2 {
    public ConstructorEx2() {
        System.out.println("0 arg Constructor");
    }
    public ConstructorEx2(int a) {
        System.out.println("1 arg Constructor = "+a);
    }
    public ConstructorEx2(int a, int b) {
        System.out.println("2 arg Constructor = "+a+" "+b);
    }
    public ConstructorEx2(int a, int b, int c) {
        System.out.println("3 arg Constructor = "+a+" "+b+" "+c);
    }
    void m1(){
        System.out.println("M1 Method");
    }
    void m2(){
        System.out.println("M2 Method");
    }
    void m3(){
        System.out.println("M3 Method");
    }
    void m4(){
        System.out.println("M4 Method");
    }

    public static void main(String[] args){
        //Using Object creation
        ConstructorEx2 cEx21 = new ConstructorEx2();
        cEx21.m1();
        ConstructorEx2 cEx22 = new ConstructorEx2(10);
        cEx22.m2();
        ConstructorEx2 cEx23 = new ConstructorEx2(100, 200);
        cEx23.m3();
        ConstructorEx2 cEx24 = new ConstructorEx2(1000, 2000, 3000);
        cEx24.m4();

        //Nameless approach Object creation
        new ConstructorEx2().m1();
        new ConstructorEx2(10).m2();
        new ConstructorEx2(100, 200).m3();
        new ConstructorEx2(1000, 2000, 3000).m4();

    }
}
