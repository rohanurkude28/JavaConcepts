package java8.lambda;

import java.util.ArrayList;
import java.util.List;

/**(ClassName::methodName)*/

class Test2 {

    // instance function to be called
    void someFunction(String s)
    {
        System.out.println(s);
    }
}

public class ArbitraryInstanceMethodLambda {
    public static void main(String[] args)
    {

        List<String> list = new ArrayList<String>();
        list.add("I");
        list.add("Love");
        list.add("Java");

        // call the instance method
        // using double colon operator
        list.forEach((new Test2())::someFunction);
    }
}