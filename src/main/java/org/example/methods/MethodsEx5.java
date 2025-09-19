package org.example.methods;

public class MethodsEx5 {
    int b = 20; //Instance Variable
    int a = 30; //Instance Variable
    void m1(int a){  //Local Variable

        System.out.println("Instance Method Local Variable = "+a);
        System.out.println("Instance Method Instance Variable = "+b);
        System.out.println("Instance Method Instance Variable = "+this.a);
    }
    static void m2(int a){
        System.out.println("Static Method Local Variable = "+a);
        // Cannot use 'this' keyword in static method
        //System.out.println("Instance Method Instance Variable = "+this.a);

        //Use object
        MethodsEx5 mEx5 = new MethodsEx5();
        System.out.println("Static Method Instance Variable = "+mEx5.a);
    }

    public static void main(String[] args){
        MethodsEx5 mEx5 = new MethodsEx5();
        mEx5.m1(10);

        MethodsEx5.m2(100);
    }
}
