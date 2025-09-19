package org.example.inheritance;
class HierarParent{
    void parent(){
        System.out.println("HierarParent");
    }
}
class HierarChild1 extends HierarParent{
    void child1(){
        System.out.println("HierarChild1");
    }
}
class HierarChild2 extends HierarParent{
    void child2(){
        System.out.println("HierarChild2");
    }
}
class HierarChild3 extends HierarParent{
    void child3(){
        System.out.println("HierarChild3");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        HierarParent H1 = new HierarParent();
        H1.parent();
        HierarChild1 C1 = new HierarChild1();
        C1.parent();
        C1.child1();
        HierarChild2 C2 = new HierarChild2();
        C2.parent();
        C2.child2();
        HierarChild3 C3 = new HierarChild3();
        C3.parent();
        C3.child3();
    }
}
