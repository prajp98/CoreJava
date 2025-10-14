package org.example.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx4 {
    public static void main(String[] args) {
        Set<Integer> s42 = new HashSet<Integer>();
        s42.add(30);
        s42.add(50);
        s42.add(10);
        s42.add(40);
        s42.add(60);
        s42.add(20);

        Iterator<Integer> itr = s42.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Set<Integer> s421 = new LinkedHashSet<Integer>();
        s421.add(300);
        s421.add(500);
        s421.add(100);
        s421.add(400);
        s421.add(600);
        s421.add(200);

        Iterator<Integer> itr1 = s421.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
