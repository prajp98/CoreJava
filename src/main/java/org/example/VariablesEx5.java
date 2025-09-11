package org.example;

public class VariablesEx5 {
    int a;
    static int b;

    public static void main(String[] args) {
        VariablesEx5 vEx5 = new VariablesEx5();
        System.out.println("Instance Variable = "+vEx5.a);
        System.out.println("Static Variable = "+vEx5.b);

        vEx5.a = 10;
        vEx5.b = 20;
        System.out.println("Instance Variable = "+vEx5.a);
        System.out.println("Static Variable = "+vEx5.b);

        VariablesEx5 vEx51 = new VariablesEx5();
        //New instance variable for new object
        System.out.println("Instance Variable = "+vEx51.a);
        //Static variable shared by all objects
        System.out.println("Static Variable = "+vEx51.b);

        vEx51.a = 100;
        vEx51.b = 200;
        System.out.println("Instance Variable = "+vEx51.a);
        System.out.println("Static Variable = "+vEx51.b);

        VariablesEx5 vEx52 = new VariablesEx5();
        System.out.println("Instance Variable = "+vEx52.a);
        System.out.println("Static Variable = "+vEx52.b);
    }
}
