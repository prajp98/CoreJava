package org.example.constructors;

public class ConstructorEx6 {
    int id;
    String name;
    int salary;

    public ConstructorEx6(int id, String name, int salary) { // Local vars
        //Instance vars assignment
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("Constructor === "+"ID : "+id+" Name : "+name+" Salary : "+salary);
    }
    void display(){
        System.out.println("Display === ID : "+id+" Name : "+name+" Salary : "+salary);

    }
    public static void main(String[] args){
        ConstructorEx6 cEx61 = new ConstructorEx6(101, "John", 10000);
        cEx61.display();
        ConstructorEx6 cEx62 = new ConstructorEx6(102, "Harsh", 20000);
        cEx62.display();
        new ConstructorEx6(103, "Kate", 30000).display();
        new ConstructorEx6(104, "Ben", 40000).display();

    }
}
