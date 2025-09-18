package org.example.instanceblock;

public class InstanceBlockEx6 {
    int id;
    String name;
    int salary;

    {
        id = 101;
        name = "John";
        salary = 10000;
    }
    void display(){
        System.out.println("ID : "+id+" Name : "+name+" Salary : "+salary);
    }
    public static void main(String[] args) {
        new InstanceBlockEx6().display();
    }
}
