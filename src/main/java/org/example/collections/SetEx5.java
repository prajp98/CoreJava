package org.example.collections;

import java.util.HashSet;
import java.util.Set;

public class SetEx5 {
    public static void main(String[] args) {

        Set<Integer> s5 = new HashSet<Integer>();
        s5.add(10);
        s5.add(50);
        s5.add(20);
        s5.add(40);
        s5.add(30);
        s5.add(60);

        System.out.println(s5);

        //!st Method

//        Set<Integer> s51 = new HashSet<Integer>(s5);
//        s51.add(100);
//        s51.add(500);
//        s51.add(200);
//        s51.add(400);
//        s51.add(300);
//        s51.add(600);
//
//        System.out.println(s51);

        //2nd method addAll
        Set<Integer> s51 = new HashSet<Integer>(s5);
        s51.add(100);
        s51.add(500);
        s51.add(200);
        s51.add(400);
        s51.add(300);
        s51.add(600);
        s51.addAll(s5);
        System.out.println(s51);

    }
}
