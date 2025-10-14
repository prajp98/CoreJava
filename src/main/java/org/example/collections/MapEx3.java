package org.example.collections;

import java.util.*;

public class MapEx3 {
    public static void main(String[] args) {

        HashMap m3 = new HashMap();
        m3.put(40,"ggg");
        m3.put(10,"uuu");
        m3.put(30,"aaa");
        m3.put(50,"ccc");
        m3.put(20,"mmm");
        m3.put(70,"bbb");
        m3.put(80,"ddd");
        m3.put(60,"eee");

        Set key = m3.keySet();
        System.out.println("Keys : "+key);

        Collection value = m3.values();
        System.out.println("Values : "+value);

        //Key and values
        Set set = m3.entrySet();

        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry keyvalue = (Map.Entry) itr.next();
            System.out.println("Key : "+keyvalue.getKey()+" Value : "+keyvalue.getValue());
        }
    }
}
