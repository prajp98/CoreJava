package org.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Object sorting
//Comparator - interface
//compare impl method
class Emp14{
    int id;
    String name;

    public Emp14(int id, String name) {
        this.id = id;
        this.name = name;
    }

}

class EmpId implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        Emp14 e1 = (Emp14) obj1;
        Emp14 e2 = (Emp14) obj2;
        if(e1.id == e2.id){
            return 0;
        }else if(e1.id > e2.id){
            return 1;
        }else {
            return -1;
        }
    }
}

class EmpName implements Comparator{

    @Override
    public int compare(Object obj1, Object obj2) {
        Emp14 e1 = (Emp14) obj1;
        Emp14 e2 = (Emp14) obj2;
        return e1.name.compareTo(e2.name);
    }
}
public class ListEx14 {
    public static void main(String[] args) {
        ArrayList<Emp14> al = new ArrayList<Emp14>();
        al.add(new Emp14(300, "ddd"));
        al.add(new Emp14(500, "aaa"));
        al.add(new Emp14(100, "ccc"));
        al.add(new Emp14(600, "eee"));
        al.add(new Emp14(400, "bbb"));
        al.add(new Emp14(200, "fff"));

        System.out.println("Id Sorting : ");
        Collections.sort(al,new EmpId());
        for(Emp14 e : al){
            System.out.println(e.id+" "+e.name);
        }

        System.out.println("Name Sorting : ");
        Collections.sort(al,new EmpName());
        for(Emp14 e : al){
            System.out.println(e.id+" "+e.name);
        }
    }
}
