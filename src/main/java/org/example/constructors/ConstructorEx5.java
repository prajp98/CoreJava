package org.example.constructors;

public class ConstructorEx5 {
    int id;
    String name;
    int salary;

    public ConstructorEx5(int eId, String eName, int eSalary) {
        //Local vars are assigned, not instance vars
        System.out.println("Constructor === "+"ID : "+eId+" Name : "+eName+" Salary : "+eSalary);

        //Assign local to instance vars
        id = eId;
        name = eName;
        salary = eSalary;
    }

    void display(){
        System.out.println("Display === ID : "+id+" Name : "+name+" Salary : "+salary);
    }

    public static void main(String[] args){
        ConstructorEx5 cEx51 = new ConstructorEx5(101, "John", 10000);
        ConstructorEx5 cEx52 = new ConstructorEx5(102, "Peter", 20000);
        ConstructorEx5 cEx53 = new ConstructorEx5(103, "Alice", 30000);

        cEx51.display();
        cEx52.display();
        cEx53.display();

    }
}
