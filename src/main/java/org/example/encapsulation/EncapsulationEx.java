package org.example.encapsulation;

public class EncapsulationEx {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setId(101);
        e1.setName("John");
        e1.setAge(25);
        e1.setAddress("Bangalore");

        System.out.println("ID : "+e1.getId());
        System.out.println("Name : "+e1.getName());
        System.out.println("Age : "+e1.getAge());
        System.out.println("ID : "+e1.getAddress());

        Employee e2 = new Employee();
        e2.setId(102);
        e2.setName("David");
        e2.setAge(21);
        e2.setAddress("Chennai");

        System.out.println("ID : "+e2.getId());
        System.out.println("Name : "+e2.getName());
        System.out.println("Age : "+e2.getAge());
        System.out.println("ID : "+e2.getAddress());
    }
}
