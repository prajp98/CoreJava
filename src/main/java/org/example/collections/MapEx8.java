package org.example.collections;

import java.io.Serializable;
import java.util.*;

public class MapEx8 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        System.out.println(al instanceof Cloneable);
        System.out.println(al instanceof Serializable);

        LinkedList ll = new LinkedList<>();
        System.out.println(ll instanceof Cloneable);
        System.out.println(ll instanceof Serializable);

        HashSet hs = new HashSet();
        System.out.println(hs instanceof Cloneable);
        System.out.println(hs instanceof Serializable);

        LinkedHashSet lhs = new LinkedHashSet();
        System.out.println(lhs instanceof Cloneable);
        System.out.println(lhs instanceof Serializable);

        TreeSet ts = new TreeSet();
        System.out.println(ts instanceof Cloneable);
        System.out.println(ts instanceof Serializable);

        HashMap hm = new HashMap();
        System.out.println(hm instanceof Cloneable);
        System.out.println(hm instanceof Serializable);

        LinkedHashMap lhm = new LinkedHashMap();
        System.out.println(lhm instanceof Cloneable);
        System.out.println(lhm instanceof Serializable);

        TreeMap tm = new TreeMap();
        System.out.println(tm instanceof Cloneable);
        System.out.println(tm instanceof Serializable);

    }
}
