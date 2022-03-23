package java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class ClassConstructorLambda {
    public ClassConstructorLambda(String s)
    {
        System.out.println("Hello " + s);
    }

    // Driver code
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("I");
        list.add("Love");
        list.add("Java");

        // call the class constructor
        // using double colon operator
        list.forEach(ClassConstructorLambda::new);
    }
}

