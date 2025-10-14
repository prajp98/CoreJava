package org.example.collections;

import java.util.TreeMap;

public class MapEx6 {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap<>();
        tm.put(40,"ccc");
        tm.put(30,"aaa");
        tm.put(10,"ddd");
        tm.put(50,"bbb");
        tm.put(60,"fff");
        tm.put(20,"eee");

        System.out.println(tm);

        //Class cast exception
        //tm.put("aaa",false);
    }
}
