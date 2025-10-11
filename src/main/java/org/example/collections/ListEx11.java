package org.example.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListEx11 {
    public static void main(String[] args) {
        //To sort values - sort() method
        //To sort objects - comparable and comparator interface
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(20);
        al.add(50);
        al.add(10);
        al.add(30);
        al.add(60);
        al.add(40);

        System.out.println("Before Sorting : "+al);

        //Collection - interface
        //Collections - impl class

        Collections.sort(al);
        System.out.println("After Sorting : "+al);

        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("ggg");
        al1.add("ccc");
        al1.add("aaa");
        al1.add("ddd");
        al1.add("bbb");
        al1.add("eee");

        System.out.println("Before Sorting : "+al1);

        Collections.sort(al1);
        System.out.println("After Sorting : "+al1);

    }
}
