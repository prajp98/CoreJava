package org.example.string;

public class StringMe7 {
    public static void main(String[] args) {
        //== compares memory location and value
        //s1 and s2 same heap memory in same constant pool memory
        String s1 = "Sachin";
        String s2 = "Sachin";
        //stored in separate memory locations
        String s3 = new String("Sachin");
        String s4 = new String("Sachin");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s4==s3);
    }
}
