package examples.constructors;

import java.util.HashMap;

class Parent{
    Parent(int i){
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent{
    Child(){
//        cant use super without params as we haven't no args constructor in parent class
//        super();
        super(10);
    }
}

public class ConstWithInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        HashMap<Integer, Integer> map = new HashMap<>();
    }
}
