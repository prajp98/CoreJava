package org.example.java8features;

interface Parent2{
    void add(int a, int b);
}

public class LambdaEx2{
    public static void main(String[] args) {

        Parent2 P2 = (int a, int b) -> {
            System.out.println("a = "+a+" b = "+b);
        };
        P2.add(1, 2);

        //No need to mention data type too
        Parent2 P21 = (a, b) -> {
            System.out.println("a = "+a+" b = "+b);
        };
        P21.add(100, 200);
    }
}