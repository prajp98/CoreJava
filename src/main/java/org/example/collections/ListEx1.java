package org.example.collections;

import java.util.ArrayList;

public class ListEx1 {
    public static void main(String[] args) {

        ArrayList al1 = new ArrayList();
        //Takes only object input,
        // so primitive value is converted to object internally first
        // Autoboxing
        al1.add(10);
        al1.add(100.00);
        al1.add(1000.00f);
        al1.add('a');
        al1.add("AAA");
        al1.add(true);
        al1.add(10);
        al1.add(100.00);
        al1.add(1000.00f);
        al1.add('a');
        al1.add("AAA");
        al1.add(true);

        al1.add(null);

        System.out.println(al1);
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);
        al1.add(500);


        //Wrapper object Integer
        ArrayList<Integer> al11 = new ArrayList<Integer>();
        al11.add(10);
        al11.add(20);
        al11.add(30);
        //al11.add("aaa");
        al11.add(10);
        al11.add(20);
        al11.add(30);

        al11.add(null);

        System.out.println(al11);

    }
}
