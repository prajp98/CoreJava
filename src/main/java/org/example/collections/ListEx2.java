package org.example.collections;

import java.util.ArrayList;

class Employee{
    int id;
    String name;
    public Employee(int id, String name){
        super();
        this.id = id;
        this.name = name;
    }
}

class Student{
    int sid;
    String sname;

    public Student(int sid, String sname) {
        super();
        this.sid = sid;
        this.sname = sname;
    }
}
public class ListEx2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Adam");
        Student s1 = new Student(201, "Ben");

        ArrayList al2 = new ArrayList();
        al2.add(e1);
        al2.add(s1);
        al2.add(10);
        al2.add("Aaa");
        //Package name + Class name + hashcode value
        System.out.println(al2);
        System.out.println(al2.toString());

        for(Object obj : al2){
            //check if object of Employee is available or not
            if(obj instanceof Employee){
                //Typecasting
                Employee emp1 = (Employee) obj;
                System.out.println(emp1.id+" "+emp1.name);
            }
            if(obj instanceof Student){
                //Typecasting
                Student stu = (Student) obj;
                System.out.println(stu.sid+" "+stu.sname);
            }
            if(obj instanceof Integer){
                System.out.println(obj);
            }
            if(obj instanceof String){
                System.out.println(obj);
            }
        }
    }
}
