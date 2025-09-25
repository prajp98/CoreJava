package org.example.polymorphism;

class Animal{

}
class Bird extends Animal{

}
class OverridingPar3{
    Animal m1(){
        System.out.println("Parent Method");
        return new Animal();
    }
//    Bird m1(){
//        System.out.println("Child Method");
//        return new Bird();
//    }
}
public class OverridingEx3 extends OverridingPar3{
//    Animal m1(){
//        System.out.println("Parent Method");
//        return new Animal();
//    }
    Bird m1(){
        System.out.println("Child Method");
        return new Bird();
    }

    public static void main(String[] args) {
        new OverridingEx3().m1();

    }
}
