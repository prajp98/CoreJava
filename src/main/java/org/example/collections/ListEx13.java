package org.example.collections;

import java.util.ArrayList;
import java.util.Collections;

//Generic arraylist
class Emp13 implements Comparable<Emp13> {
    int id;
    String name;

    public Emp13(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Emp13 emp) {
        if(id == emp.id){
            return id;
        }else if(id > emp.id){
            return 1;
        }else {
            return -1;
        }
    }
}
public class ListEx13 {
    public static void main(String[] args) {
        ArrayList<Emp13> al = new ArrayList<Emp13>();
        al.add(new Emp13(300, "ddd"));
        al.add(new Emp13(500, "aaa"));
        al.add(new Emp13(100, "ccc"));
        al.add(new Emp13(600, "eee"));
        al.add(new Emp13(400, "bbb"));
        al.add(new Emp13(200, "ddd"));

        Collections.sort(al);
        for(Emp13 e : al){
            System.out.println(e.id+" "+e.name);
        }
    }
}
