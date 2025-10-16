package org.example.collections;

import java.util.TreeSet;

public class SetEx7 {
    public static void main(String[] args) {
        //DOes not allow null value
        TreeSet t1 = new TreeSet<>();
        t1.add(40);
        t1.add(60);
        t1.add(10);
        t1.add(30);
        t1.add(50);
        t1.add(20);
        t1.add(40);
        t1.add(60);
        t1.add(10);
        t1.add(30);
        t1.add(50);
        t1.add(20);
        //t1.add(null);
        System.out.println(t1);

        TreeSet t2 = new TreeSet();
        t2.add("fff");
        t2.add("aaa");
        t2.add("ccc");
        t2.add("ddd");
        t2.add("bbb");
        t2.add("ggg");
        t2.add("eee");
        t2.add("fff");
        t2.add("aaa");
        t2.add("ccc");
        t2.add("ddd");
        t2.add("bbb");
        t2.add("ggg");
        t2.add("eee");
        //t2.add(null);

        System.out.println(t2);
    }
}
