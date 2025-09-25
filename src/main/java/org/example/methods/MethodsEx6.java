package org.example.methods;

public class MethodsEx6 {
    public static void main(String[] args){
        System.out.println(10 + 10);
        System.out.println(10 + 10 + "Wel" + "come");
        //After string, int is considered string and concatenated
        System.out.println(10 + 10 + "Wel" + "come" + 100 + 100);
        //Use () to calculate and then concatenate
        System.out.println(10 + 10 + "Wel" + "come" + (100 + 100));
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a + b + c);
        System.out.println(a + " " + b + " " + c);
    }
}
