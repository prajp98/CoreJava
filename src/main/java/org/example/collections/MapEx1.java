package org.example.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
    public static void main(String[] args) {
        //Overrides if key is present
        //Key duplicates not allowed
        //Values duplicates allowed
        //Both key and value allows heterogenous values
        //1 null key allowed, multiple null values allowed
        Map map = new HashMap();
        map.put(10, "ddd");
        map.put(10.00, "ccc");
        map.put('a', "aaa");
        map.put("abcd", "eee");
        map.put(true, "bbb");
        map.put(100.00f, "ggg");
        map.put(10, "fff");

        map.put(10, "aaa");
        map.put(10.00, "www");
        map.put('a', "abc");
        map.put("abcd", "ghe");
        map.put(true, "bbp");
        map.put(100.00f, "gkg");
        map.put(10, "ffi");

        map.put(2,"aaa");
        map.put(3,"aaa");
        map.put(4,"aaa");
        map.put(5,"aaa");

        map.put(20,100);
        map.put(30,100.00);
        map.put(40,100.0f);
        map.put(50,'c');
        map.put(60,"abcdefgh");
        map.put(70,true);
        map.put(80,100);

        map.put(null, "xyz");
        map.put(null, "xyzz");
        map.put(null, "xyzzz");
        map.put("xyz", null);
        map.put("xxyz", null);
        map.put("xxxyz", null);

        System.out.println(map);

    }
}
