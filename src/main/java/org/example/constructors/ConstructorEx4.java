package org.example.constructors;

public class ConstructorEx4 {
    int id;
    String name;
    int salary;

    public ConstructorEx4() {
        id = 101;
        name = "John";
        salary = 100000;

        //Last updated value
        id = 102;
        name = "John1";
        salary = 200000;
    }
    void display(){
        System.out.println("ID : "+id+" Name : "+name+" Salary : "+salary);
    }

    public static void main(String[] args){
        ConstructorEx4 cEx4 = new ConstructorEx4();
        cEx4.display();
        //to initialise more than 1 object, use parameterised constructor
    }
}
