package org.example.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ListEx10 {
    public static void main(String[] args) {

        String str[] = {"aaa", "bbb", "ccc", "ddd"};
        //To convert array to list - arrays.aslist
        ArrayList<String> al = new ArrayList<String>(Arrays.asList(str));
        al.add("eee");
        al.add("fff");
        for(String str1 : al){
            System.out.println(str1);
        }

        //To convert list to array - toArray
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add("aaa");
        al1.add('a');
        al1.add(100.00f);
        al1.add(true);

        Object[] obj = al1.toArray();

        for(Object ob : obj){
            System.out.println(ob);
        }
    }
}
