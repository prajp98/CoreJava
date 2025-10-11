package org.example.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Emp9{
    int id;
    String name;

    public Emp9(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class ListEx9 {
    public static void main(String[] args) {
        Emp9 e91 = new Emp9(101, "aaa");
        Emp9 e92 = new Emp9(201, "bbb");
        Emp9 e93 = new Emp9(301, "ccc");
        Emp9 e94 = new Emp9(401, "ddd");
        Emp9 e95 = new Emp9(501, "eee");
        Emp9 e96 = new Emp9(601, "fff");
        Emp9 e97 = new Emp9(701, "ggg");

        ArrayList<Emp9> al9 = new ArrayList<Emp9>();
        al9.add(e91);
        al9.add(e92);
        al9.add(e93);
        al9.add(e94);

        ListIterator<Emp9> litr = al9.listIterator();

        litr.add(e95);

        while(litr.hasNext()){
            Emp9 e9 = litr.next();
            if(e9.name.equals("aaa")){
                litr.remove();
            }
//            System.out.println(e9.id+" "+e9.name);
            if(e9.name.equals("bbb")){
                litr.set(e97);
            }
        }

        for (Emp9 e9 : al9){
            System.out.println(e9.id+" "+e9.name);
        }

    }
}
