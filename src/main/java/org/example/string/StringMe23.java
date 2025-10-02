package org.example.string;

public class StringMe23 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        //Start,end
        sb.delete(1,3);
        System.out.println(sb); //Hlo
    }
}
