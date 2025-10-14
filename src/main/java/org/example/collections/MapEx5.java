package org.example.collections;

import java.util.TreeMap;

public class MapEx5 {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap<>();
        tm.put(40,10);
        tm.put(30,"aaa");
        tm.put(10,10.00);
        tm.put(50,10.00f);
        tm.put(60,'a');
        tm.put(20,false);

        System.out.println(tm);
    }
}
