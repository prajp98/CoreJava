package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
    public static void main(String[] args) {
        List l3 = new ArrayList();
        l3.add(10);
        l3.add('a');
        l3.add("aaa");
        l3.add(true);

        System.out.println(l3);
        //Index and value
        l3.add(0, 100);
        System.out.println(l3);
        //Length
        System.out.println(l3.size());
        //Remove
        l3.remove(0);
        System.out.println(l3);
        System.out.println(l3.size());

        l3.remove("aaa");
        System.out.println(l3);
        System.out.println(l3.size());

        System.out.println(l3.contains('a'));

        System.out.println(l3.isEmpty());

        l3.clear();
        System.out.println(l3.isEmpty());
    }
}
