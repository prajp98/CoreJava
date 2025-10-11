package org.example.collections;

import java.util.ArrayList;

class Emp4{
    int eid;
    String ename;

    public Emp4(int eid, String name) {
        super();
        this.eid = eid;
        this.ename = name;
    }
}
public class ListEx4 {
    public static void main(String[] args) {

        ArrayList<Emp4> al4 = new ArrayList<Emp4>();

        al4.add(new Emp4(101, "aaa"));
        al4.add(new Emp4(201, "bbb"));
        al4.add(new Emp4(301, "ccc"));
        al4.add(new Emp4(401, "ddd"));
        al4.add(new Emp4(501, "eee"));

        //Arraylist into another arraylist
//        ArrayList<Emp4> al41 = new ArrayList<Emp4>(al4);
//        al41.add(new Emp4(601, "fff"));
//        al41.add(new Emp4(701, "ggg"));

        ArrayList<Emp4> al41 = new ArrayList<Emp4>();
        al41.add(new Emp4(601, "fff"));
        al41.add(new Emp4(701, "ggg"));
        al41.addAll(al4);

        for(Emp4 em1 : al41){
            System.out.println(em1.eid+" "+em1.ename);
        }

        System.out.println(al41.containsAll(al4));
        //false
        System.out.println(al4.containsAll(al41));

        //remove all of al4 stuff from al41
//        al41.removeAll(al4);
//        for(Emp4 em2 : al41){
//            System.out.println(em2.eid+" "+em2.ename);
//        }

        //Retain all stuff of al4 in al41 and remove others
        al41.retainAll(al4);
        for(Emp4 em2 : al41){
            System.out.println(em2.eid+" "+em2.ename);
        }

    }
}
