package org.example.collections;

import java.util.ArrayList;

class Emp5{
    int e5id;
    String e5name;

    public Emp5(int e5id, String e5name) {
        super();
        this.e5id = e5id;
        this.e5name = e5name;
    }
}
public class ListEx5 {
    public static void main(String[] args) {
        //ArrayList - not using generic al - use Object
        ArrayList al5 = new ArrayList();
        al5.add(new Emp5(101, "aaa"));
        al5.add(new Emp5(201, "bbb"));

        for(Object obj : al5){
            if(obj instanceof Emp5) {
                Emp5 e51 = (Emp5) obj;
                System.out.println(e51.e5id + " " + e51.e5name);
            }
        }

        Emp5 e = (Emp5) al5.get(0);
        System.out.println(e.e5id + " " + e.e5name);

        //generic collection
        ArrayList<Emp5> al51 = new ArrayList<Emp5>();
        al51.add(new Emp5(301, "ccc"));
        al51.add(new Emp5(401, "ddd"));

        for(Emp5 e1 : al51){
            System.out.println(e1.e5id + " " + e1.e5name);
        }

        Emp5 e2 = al51.get(1);
        System.out.println(e2.e5id + " " + e2.e5name);

    }
}
