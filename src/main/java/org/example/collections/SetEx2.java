package org.example.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        //Insertion order preserved
        //Duplicates not allowed
        //Heterogenous data allowed
        Set hset1 = new LinkedHashSet();
        hset1.add(10);
        hset1.add('a');
        hset1.add("aaa");
        hset1.add(10.00);
        hset1.add(true);
        hset1.add(null);
        hset1.add(10);
        hset1.add('a');
        hset1.add("aaa");
        hset1.add(10.00);
        hset1.add(true);
        hset1.add(null);

        System.out.println(hset1);

        Set<String> hs = new LinkedHashSet<String>();
        hs.add("ddd");
        hs.add("ccc");
        hs.add("aaa");
        hs.add("eee");
        hs.add("bbb");
        hs.add("fff");
        hs.add("ddd");
        hs.add("ccc");
        hs.add("aaa");
        hs.add("eee");
        hs.add("bbb");
        hs.add("fff");

        System.out.println(hs);
    }
}
