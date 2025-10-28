package org.example.java8features;

interface Parent4{
    int add(int a, int b);
}

public class LambdaEx4{
    public static void main(String[] args) {

        Parent4 P4 = (a, b) -> {
            return a + b;
        };
        int res = P4.add(10, 20);
        System.out.println(res);
    }
}
