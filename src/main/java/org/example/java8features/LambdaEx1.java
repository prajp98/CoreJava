package org.example.java8features;

interface Parent1{
    void add();
}

public class LambdaEx1{
    public static void main(String[] args) {
        //No separate class, class name, modifier, return type
        //Can impl one method
        Parent1 P1 = () -> {
            System.out.println("Lambda Expression - 1");
        };
        P1.add();

    }
}
