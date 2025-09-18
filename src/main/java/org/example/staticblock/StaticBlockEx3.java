package org.example.staticblock;

public class StaticBlockEx3 {
    int b = 20;
    static int c = 30;
    void m1(){
        System.out.println("Instance Method");
    }
    static void m2(){
        System.out.println("Static Method");
    }
    static {
        //Local var
        int a = 10;
        System.out.println("Local Variable = "+a);

        //Need to create object for instance variable in static block
        StaticBlockEx3 Ex3 = new StaticBlockEx3();
        System.out.println("Instance Variable = "+Ex3.b);

        System.out.println("Static Variable Direct Access = "+c);
        System.out.println("Static Variable Using Object = "+Ex3.c);
        System.out.println("Static Variable Using Class Name = "+StaticBlockEx3.c);

        Ex3.m1();

        m2();
        Ex3.m2();
        StaticBlockEx3.m2();
    }

    public StaticBlockEx3() {
        System.out.println("Constructor");
    }
    {
        System.out.println("Instance Block");
    }

    public static void main(String[] args){
        System.out.println("Welcome");
    }
}
