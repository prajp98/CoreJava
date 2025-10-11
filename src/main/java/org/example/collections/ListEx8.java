package org.example.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListEx8 {
    public static void main(String[] args) {
        ArrayList<String> al8 = new ArrayList<String>();
        al8.add("aaa");
        al8.add("bbb");
        al8.add("ccc");
        al8.add("ddd");
        al8.add("eee");
        //ListIterator both directions
        //Can only be used for Lists
        ListIterator<String> litr = al8.listIterator();
        while (litr.hasNext()){
            System.out.println("Forward : "+litr.next());
        }
        while (litr.hasPrevious()){
            System.out.println("Reverse : "+litr.previous());
        }
    }
}
