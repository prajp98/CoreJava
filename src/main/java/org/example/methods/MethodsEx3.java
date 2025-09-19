package org.example.methods;

public class MethodsEx3 {
    // Return Type must be mentioned
//     m1(){
//        System.out.println("Without Argument Without Return Type");
//    }
    void m1(){
        System.out.println("Without Argument Without Return Type");
    }
    int m2(){
        System.out.println("Without Argument With Return Type");
        return 10;
    }
    void m3(int a, int b, String str){
        System.out.println("With Argument Without Return Type = "+a+" "+b+" "+str);
    }
    int m4(int a, int b){
        int c = a + b;
        System.out.println("With Argument With Return Type = "+c);
        return c;
    }

    public static void main(String[] args){
        MethodsEx3 mEx3 = new MethodsEx3();
        mEx3.m1();
        int a = mEx3.m2();
        System.out.println("Return Value = "+a);
        mEx3.m3(10, 20, "Java Programming");
        int res = mEx3.m4(100, 200);
        System.out.println("Addition = "+res);

    }
}
