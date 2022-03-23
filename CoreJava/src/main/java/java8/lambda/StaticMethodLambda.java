package java8.lambda;

import java.util.ArrayList;
import java.util.List;

/**(ClassName::methodName)*/
public class StaticMethodLambda {

    static void someFunction(String s)
    {
        System.out.println(s);
    }

    public static void main(String[] args)
    {

        List<String> list = new ArrayList<String>();
        list.add("I");
        list.add("Love");
        list.add("Java");

        // call the static method
        // using double colon operator
        list.forEach(StaticMethodLambda::someFunction);
    }
}
