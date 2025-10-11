package org.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx7 {
    public static void main(String[] args) {

        ArrayList<Integer> al7 = new ArrayList();
        al7.add(10);
        al7.add(20);
        al7.add(30);
        al7.add(40);
        al7.add(50);
        //Iterator - Only forward direction
        Iterator<Integer> itr = al7.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
