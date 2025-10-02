package org.example.string;

public class StringEx2 {
    public static void main(String[] args) {
        //Immutable
        String s1 = "aaaaa";
        s1.concat("bbbbb");
        System.out.println(s1);

        //Mutable
        StringBuffer sb = new StringBuffer("aaaaa");
        sb.append("bbbbb");
        System.out.println(sb);
    }
}
