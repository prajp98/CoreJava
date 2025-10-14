package org.example.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetEx3 {
    public static void main(String[] args) {
        //Treeset maintains ascending order
        //Impl sorted set interface
        //internally has compareto method
        //No duplicates allowed
        //Homogenous data only allowed
        Set t1 = new TreeSet();
        t1.add(40);
        t1.add(60);
        t1.add(10);
        t1.add(30);
        t1.add(50);
        t1.add(20);
        t1.add(70);

        t1.add(40);
        t1.add(60);
        t1.add(10);
        t1.add(30);
        t1.add(50);
        t1.add(20);
        t1.add(70);

        System.out.println(t1);
    }
}
