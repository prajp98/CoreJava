package org.example.string;

//String is an object - collection of characters (not datatype)
//String is immutable (unmodifiable/ unchangeable) using predefined methods
//values can't be changed
//String can be created using String, String buffer, String Builder - last 2 can be modified
//String buffer - thread safe(sync) - only 1 thread can access at a time
//String Builder - not thread safe ( not sync) - multiple threads can access at a time
//Can use String new keyword - separate memory space
// String literal - if string is already present in heap memory in string constant pool memory
// only reference is changed
//Otherwise new memory space is allocated
public class StringMe1 {
    public static void main(String[] args) {

        char ch2 = 'a';
        char[] ch3 = {'a', 'b'};
        String s1 = "ab";

        char[] ch = {'j', 'a', 'v', 'a'};
        String s = new String(ch);
        System.out.println(s);

        String str = new String("Java");
        String str1 = "Java";


    }
}
