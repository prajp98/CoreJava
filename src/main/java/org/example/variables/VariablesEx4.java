package org.example.variables;

public class VariablesEx4 {
    static char a;
    static int b = 100;

    public static void main(String[] args){

        VariablesEx4 vEx4 = new VariablesEx4();
        //3 methods
        System.out.println("Direct access "+ a);
        System.out.println("Object creation "+ vEx4.a);
        System.out.println("Class name "+ VariablesEx4.a);

        System.out.println("Direct access "+ b);
        System.out.println("Object creation "+ vEx4.b);
        System.out.println("Class name "+ VariablesEx4.b);

    }
}
