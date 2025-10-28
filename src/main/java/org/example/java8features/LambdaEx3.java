package org.example.java8features;

interface Parent3{
    String add();
}

public class LambdaEx3{
    public static void main(String[] args) {

        Parent3 P3 = () -> {
            return "Lambda Expression Return";
        };
        String str = P3.add();
        System.out.println(str);
    }
}
