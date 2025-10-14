package org.example.collections;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        //Hahsset impl class
        //Allows heterogenous data
        //Insertion order not allowed
        //Duplicate values not allowed
        //Allows null value
        Set set1 = new HashSet();
        set1.add(10);
        set1.add('a');
        set1.add("aaa");
        set1.add(10.00);
        set1.add(true);
        set1.add(null);

        System.out.println(set1);

        Set<Integer> s1 = new HashSet<Integer>();
        s1.add(10);
        s1.add(50);
        s1.add(30);
        s1.add(20);
        s1.add(60);
        s1.add(40);
        s1.add(10);
        s1.add(50);
        s1.add(30);
        s1.add(20);
        s1.add(60);
        s1.add(40);
        s1.add(null);

        System.out.println(s1);
    }
}
