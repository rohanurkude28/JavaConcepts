package oops;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class DynamicPolymorphismParent {
    void method1(){
        System.out.println("DynamicPolymorphismParent Method - 1");
    }

    void method2(){
        System.out.println("DynamicPolymorphismParent Method - 2");
    }

    List<String> covariantMethod(){
        System.out.println("DynamicPolymorphismParent covariantMethod");
        return new LinkedList<>();
    }
}

public class DynamicPolymorphism extends DynamicPolymorphismParent{
    void method2(){
        System.out.println("DynamicPolymorphism Method - 2");
    }

    void method3(){
        System.out.println("DynamicPolymorphism Method - 3");
    }

    ArrayList<String> covariantMethod(){
        System.out.println("DynamicPolymorphism covariantMethod");
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        DynamicPolymorphismParent polymorphism = new DynamicPolymorphism();
        polymorphism.method1();
        polymorphism.method2();
        //polymorphism.method3(); // Compile Time error
        polymorphism.covariantMethod();
    }
}
