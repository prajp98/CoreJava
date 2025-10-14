package org.example.collections;

import java.util.TreeMap;

public class MapEx7 {
    public static void main(String[] args) {

        TreeMap tm = new TreeMap<>();
        tm.put(40,"ccc");
        tm.put(30,"aaa");
        tm.put(10,"ddd");
        tm.put(50,"bbb");
        tm.put(60, null);
        tm.put(20,null);
        //Null Pointer exception
        //tm.put(null,20);

        System.out.println(tm);
    }
}
