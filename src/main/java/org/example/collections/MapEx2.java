package org.example.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapEx2 {
    public static void main(String[] args) {
        //Heterogenous keys and values allowed
        //Insertion order maintained
        Map lmap = new LinkedHashMap();
        lmap.put(10, "ddd");
        lmap.put(10.00, "ccc");
        lmap.put('a', "aaa");
        lmap.put("abcd", "eee");
        lmap.put(true, "bbb");
        lmap.put(100.00f, "ggg");
        lmap.put(10, "fff");

        lmap.put(10, "aaa");
        lmap.put(10.00, "www");
        lmap.put('a', "abc");
        lmap.put("abcd", "ghe");
        lmap.put(true, "bbp");
        lmap.put(100.00f, "gkg");
        lmap.put(10, "ffi");

        lmap.put(2,"aaa");
        lmap.put(3,"aaa");
        lmap.put(4,"aaa");
        lmap.put(5,"aaa");

        lmap.put(20,100);
        lmap.put(30,100.00);
        lmap.put(40,100.0f);
        lmap.put(50,'c');
        lmap.put(60,"abcdefgh");
        lmap.put(70,true);
        lmap.put(80,100);

        lmap.put(null, "xyz");
        lmap.put(null, "xyzz");
        lmap.put(null, "xyzzz");
        lmap.put("xyz", null);
        lmap.put("xxyz", null);
        lmap.put("xxxyz", null);

        System.out.println(lmap);
    }
}
