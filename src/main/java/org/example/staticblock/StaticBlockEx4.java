package org.example.staticblock;

public class StaticBlockEx4 {
    static int id;
    static String name;
    static int salary;
    static{
        id = 101;
        name = "John";
        salary = 10000;
    }
    static void display(){
        System.out.println("ID : "+id+" Name : "+name+" Salary : "+salary);
    }
    public static void main(String[] args){
        display();
    }
}
