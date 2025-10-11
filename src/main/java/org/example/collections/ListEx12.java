package org.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//compareTo - impl method in comparable
// internally compares values
//override it
class Emp12 implements Comparable{
    int id;
    String name;

    public Emp12(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //supports 1 sorting
    @Override
    public int compareTo(Object obj) {
        Emp12 emp = (Emp12) obj;
        if(id == emp.id){
            return id;
        }else if(id > emp.id){
            return 1;
        }else {
            return -1;
        }
    }
}
public class ListEx12 {
    public static void main(String[] args) {
        ArrayList<Emp12> al = new ArrayList<Emp12>();
        al.add(new Emp12(300, "ddd"));
        al.add(new Emp12(500, "aaa"));
        al.add(new Emp12(100, "ccc"));
        al.add(new Emp12(600, "eee"));
        al.add(new Emp12(400, "bbb"));
        al.add(new Emp12(200, "ddd"));

        Collections.sort(al);
        for(Emp12 e : al){
            System.out.println(e.id+" "+e.name);
        }
    }
}
