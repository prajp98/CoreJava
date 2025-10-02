package org.example.string;

public class StringMe8 {
    public static void main(String[] args) {
        String s1 = "AA"; //65 65
        String s2 = "BB";
        String s3 = "AB";

        String s4 = "ABCDEF";
        String s5 = "ABCDEF";
        System.out.println(s1.compareTo(s2)); // 65 - 66 = -1, skips next ch comparison
        System.out.println(s1.compareTo(s3)); // 65 - 65 = 0 then 65 - 66 = -1
        System.out.println(s3.compareTo(s1)); // 65 - 65 = 0 then 66 -65 = 1
        System.out.println(s4.compareTo(s5)); // 0
    }
}
